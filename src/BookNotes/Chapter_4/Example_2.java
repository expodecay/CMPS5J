package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/13/2015.
 * Demonstrates variable assignment and manipulation.
 */

import processing.core.PApplet;

public class Example_2 extends PApplet {

    int circleX = 100;
    int circleY = 100;

    public void setup(){
        size(500, 500);
    }

    public void draw(){
        background(100);
        stroke(255);
        fill(0);
        ellipse(circleX, circleY, 50, 50);

        circleX += 1;       // Increments the horizontal component.
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_2"});
    }
}

