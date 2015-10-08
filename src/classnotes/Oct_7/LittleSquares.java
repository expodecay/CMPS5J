package classnotes.Oct_7;
/**
 * Created by Rick on 10/7/2015.
 *
 * Based on example 3.something from the book
 */

import processing.core.PApplet;

public class LittleSquares extends PApplet {
    public void setup(){
        size(400, 400);
        background(255);
    }

    public void draw(){
        // An empty draw function
    }

    public void mousePressed(){
        stroke(0);
        fill(175);
        rectMode(CENTER);
        rect(mouseX, mouseY, 16, 16); // Center of rect is mouseX, mouseY. 16 pixels wide and 16 pixels high
    }

    public void keyPressed(){
        background(255);  // If any key is pressed on the keyboard, a fresh background is drawn.
    }

    public void mouseDragged(){
        stroke(0);
        fill(175);
        rectMode(CENTER);
        rect(mouseX, mouseY, 16, 16);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_7.LittleSquares"});
    }
}
/*
* Event listener functions: return type = void ; takes empty argument
*
* Dynamic mouse functions:
*   mouseDepressed()
*   mouseReleased()
*   mouseClicked()
*   mouseMoved()
*   mouseDragged()
*
* Dynamic keyboard functions:
*   keyPressed()
*   keyReleased()
* */
