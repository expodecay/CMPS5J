package BookNotes.Chapter_3;
/**
 * Created by Rick on 10/13/2015.
 *
 * Demonstrates mousePressed() and keyPressed()
 */

import processing.core.PApplet;

public class Example_5 extends PApplet {
    public void setup(){
        size(500, 500);
        background(255);
    }

    public void draw(){     // Nothing is drawn in this example
    }

    public void mousePressed(){
        stroke(0);
        fill(175);
        rectMode(CENTER);
        rect(mouseX, mouseY, 16, 16); // rectangle created at mouse location with width/height of 16 pixels
    }

    public void keyPressed(){
        background(255);        // Erases the background
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_3.Example_5"});
    }
}
/*
* The program continues to draw(), looping endlessly, but since the function contains no code, the window will remain
* blank. If background(255) is added, the program will appear to not work.
*
* The functions mousePressed() and keyPressed() wait to be called.
* */
