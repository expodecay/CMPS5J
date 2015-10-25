package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * Bouncing Ball
 */

import processing.core.PApplet;

public class Example_6 extends PApplet {

    // Global variables
    int x = 0;
    int speed = 10;

    public void setup(){
        size(200, 200);
        smooth();
    }
    public void draw(){
        background(255);

        x = x + speed;

        if ( (x > width) || (x < 0)){
            speed *= -1;
        }
    // Display circle at x location
        stroke(0);
        fill(175);
        ellipse(x, 100, 32, 32);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_6"});
    }
}