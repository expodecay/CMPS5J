package classnotes.Oct_7;
/**
 * Created by Rick on 10/7/2015.
 *
 */
/*  Recall that +(down) and -(up)  */

import processing.core.PApplet;

public class MovableZoog extends PApplet {

    public void setup() {
        // Set the size of the window
        size(400, 400);
        smooth();
        frameRate(30);
    }

    public void draw() {
        // Draw a white background
        background(255);

        // Set ellipses and rects to CENTER mode
        ellipseMode(CENTER);
        rectMode(CENTER);

        // Draw Zoog's body
        stroke(0);
        fill(175);
        rect(mouseX, mouseY, 20, 100); // Note that the mouse is in the center of the rectangle, the rest is behind ellipse

        // Draw Zoog's head
        stroke(0);
        fill(255);
        ellipse(mouseX, mouseY-30, 60, 60);

        // Draw Zoog's eyes
        fill(mouseX, 0, mouseY);
        ellipse(mouseX-19, mouseY-30, 16, 32);  // left eye             // +- 19 pixels from center of body
        ellipse(mouseX+19, mouseY-30, 16, 32);  // right eye

        // Draw Zoog's legs
        stroke(0);      // This is redundant. The same stroke from beginning is still valid.
        line(mouseX-10, mouseY + 50, pmouseX-10, pmouseY + 60);      // left leg
        line(mouseX + 10, mouseY + 50, pmouseX + 10, pmouseY + 60);  // right leg
    }

    public void mousePressed() {
        println( "Take me to your leader! ");
    }


    public static void main(String args[]) {
        PApplet.main(new String[]{" classnotes.Oct_7.MovableZoog"});
    }
}

