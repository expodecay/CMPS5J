package BookNotes.Chapter_3;
/**
 * Created by Rick on 10/7/2015.
 *
 * Interactive zoog
 */

import processing.core.PApplet;

public class Example_6 extends PApplet {
    public void setup(){
        size(500, 500);
        smooth();
        frameRate(30);
    }

    public void draw(){
        // Draw a black background
        background(255);

        // Set ellipses and rects to CENTER mode
        ellipseMode(CENTER);
        rectMode(CENTER);

        // Draw Zoog's body
        stroke(0);
        fill(175);
        rect(mouseX, mouseY, 20, 100);

        // Draw Zoog's head
        stroke(0);
        fill(255);
        ellipse(mouseX, mouseY - 30,60, 60);

        // Draw Soog's eyes
        fill(mouseX, 0, mouseY);        // Eye color is determined by mouse location
        ellipse(mouseX-19, mouseY-30, 16, 32);
        ellipse(mouseX+19, mouseY-30, 16, 32);

        // Draw zoog's legs
        stroke(0);
        line(mouseX-10, mouseY+50, pmouseX-10, pmouseY+60);     // Legs are drawn according to current and previous
        line(mouseX+10, mouseY+50, pmouseX+10, pmouseY+60);     // mouse location
    }

    public void mousePressed(){
        println("Take me to your leader");
    }


    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_3.Example_6"});
    }
}

