package BookNotes.Chapter_3;
/**
 * Created by Rick on 10/13/2015.
 *
 * Demonstrates how to render images through the draw function.
 */

import processing.core.PApplet;

public class Example_4 extends PApplet {

    public void setup(){
        size(500, 500);
        background(255);
        smooth();
    }

    public void draw(){
        stroke(0);
        line(pmouseX, pmouseY, mouseX, mouseY); // Draw a line from previous mouse location to current location.
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_3.Example_4"});
    }
}
/*
* Don't confuse pmouseX() with mousePressed(). pmouse stands for previous mouse location.
* */
