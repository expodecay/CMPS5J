package Assignments;
/**
 * Created by Rick on 11/7/2015.
 */

import processing.core.PApplet;

public class BallBounce extends PApplet {
    // ball variables
    float X, Y, Xspeed, Yspeed, r;
    // environment variables
    float gravity, stopSpeed, dissipation;
    boolean InBall;

    public void setup() {
        size(700,700);
        smooth();
        gravity = 0.6f;
        stopSpeed = 0.2f;
        dissipation = .08f;
        r = 50;
        X = width/2;
        Y = r;
        Yspeed = 0;
        Xspeed = 0;
        ellipseMode(RADIUS);
        // initialize ball variables

        // initialize environment variables
    }
    // do not change this function
    public void draw() {
        background(0,255,255);
        displayBall();
        if ( mousePressed && mouseOnBall() ){
            holdBall();
        }else {
            moveBall();
            updateSpeed();
        }
    }
    void displayBall(){
        // display square
        Y = constrain(Y,r,height-r);
        X = constrain(X, r, width-r);
        fill(255, 0, 0);
        noStroke();
        ellipse(X, Y, r, r);
    }
    void holdBall(){
        X = mouseX;
        Y = mouseY;

        Xspeed =  (X- pmouseX );
        Yspeed =  (Y - pmouseY );

        println("Xspeed: " + Xspeed);

    }
    void moveBall(){
        Y += Yspeed;
        X += Xspeed;
    }
    void updateSpeed(){
        if ( abs(Xspeed) < stopSpeed ){    // If Xspeed falls below stopSpeed, set to zero.
            Xspeed = 0.0f;
        }

        if (X > width-50 || X < 50) { // Keep ball with width boundary
            Xspeed = Xspeed* -1;
        }
        /*
        if (X > width-r || X < 50){
            Xspeed *= abs(1 - dissipation);
        }*/
        /*..................................................................................................*/

        if( abs(Yspeed) < stopSpeed ){    // If Yspeed falls below stopSpeed, set to zero.
            Yspeed = 0.0f;
        }

        if ( Y > height-r || Y < 50 ){   // Keep ball within height boundary
            Yspeed *= -abs(1-dissipation);
        }

        Yspeed += gravity;
    }
    boolean mouseOnBall(){
        if (abs(mouseX - X) < 50 || abs(mouseY - Y) < 50){
            InBall = true;
        }
        if (abs(mouseX - X) > 50 || abs(mouseY - Y) > 50) {
            InBall = false;
        }
        return InBall;
    }


    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.BallBounce"});
    }
}

