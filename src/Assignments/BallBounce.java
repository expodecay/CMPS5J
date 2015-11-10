package Assignments;
/**
 * Created by Rick on 11/7/2015.
 */

import processing.core.PApplet;

public class BallBounce extends PApplet {
    // ball variables
    float X, Y, Xspeed, Yspeed;
    // environment variables
    float gravity, stopSpeed, dissipation;
    public void setup() {
        size(500,500);
        smooth();

        // initialize ball variables

        // initialize environment variables
    }
    // do not change this function
    public void draw() {
        background(0,255,255);
        displayBall();
        if( mousePressed && mouseOnBall() ){
            holdBall();
        }else{
            moveBall();
            updateSpeed();
        }
    }
    void displayBall(){
        // your code goes here
    }
    void holdBall(){
        // your code goes here
    }
    void moveBall(){
        // your code goes here
    }
    void updateSpeed(){
        // your code goes here
    }
    boolean mouseOnBall(){
        return true;
    }


    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.BallBounce"});
    }
}

