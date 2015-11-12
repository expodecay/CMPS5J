package Assignments;
/**
 * Created by Rick on 11/7/2015.
 */

import processing.core.PApplet;

public class BallBounce extends PApplet {

    // riryrami
    // cmps 5J
    // pa6

    // ball variables
    float X, Y, Xspeed, Yspeed, radius;
    // environment variables
    float gravity, stopSpeed, dissipation;

    public void setup() {
        size(500,500);
        smooth();
        ellipseMode(RADIUS);
        // initialize ball variables
        radius = 50;
        X = width/2;
        Y = radius;
        Yspeed = 0;
        Xspeed = 0;
        // initialize environment variables
        gravity = 0.6f;
        stopSpeed = 0.2f;
        dissipation = .08f;
    }
    // do not change this function
    public void draw() {
        background(0, 255, 255);
        displayBall();
        if ( mousePressed && mouseOnBall() ){
            holdBall();
        }else {
            moveBall();
            updateSpeed();
        }
    }
    void displayBall(){
        Y = constrain(Y, radius ,height-radius);    // keep Y within (0, height)
        X = constrain(X, radius , width - radius);  // keep X within (0, width)
        fill(255, 0, 0);
        noStroke();
        ellipse(X, Y, radius, radius);
    }
    void holdBall(){
        X = mouseX;
        Y = mouseY;
        Xspeed =  (X - pmouseX ); // Difference must be in this order to preserve direction.
        Yspeed =  (Y - pmouseY );
    }
    void moveBall(){
        Y += Yspeed;
        X += Xspeed;
    }
    void updateSpeed(){
        if (abs(Xspeed) < stopSpeed){    // If Xspeed falls below stopSpeed, set to zero.
            Xspeed = 0.0f;
        }
        if(abs(Yspeed) < stopSpeed){    // If Yspeed falls below stopSpeed, set to zero.
            Yspeed = 0.0f;
        }
        if (X > width - radius || X < radius) { // Keep ball with width boundary
            Xspeed = Xspeed* - 1;
            Xspeed *= abs(1 - dissipation);
        }
        if ( Y > height - radius || Y < radius){   // Keep ball within height boundary
            Yspeed *= - abs(1 - dissipation);
        }
        Yspeed += gravity;
    }
    boolean mouseOnBall(){
        float distance = dist(X, Y, mouseX, mouseY);
        return (abs(distance) < radius); // Returns boolean value of condition.
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.BallBounce"});
    }
}

