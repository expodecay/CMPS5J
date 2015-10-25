package Assignments;
/**
 * Created by Rick on 10/23/2015.
 *
 */

import processing.core.PApplet;

public class ColorButtons extends PApplet {

    // riryrami
    //cmps 5J
    // pa4

    // Initial boolean values are false
    boolean redOn;
    boolean greenOn;
    boolean blueOn;
    int r = 0;
    int g = 0;
    int b = 0;
    int on = 255;
    int off = 0;
    int halfRectWidth = 50;
    int halfStrokeWidth = 6;
    int redRectCenterX = 100;
    int greenRectCenterX = 250;
    int blueRectCenterX = 400;


    public void setup(){
        size(500, 500);
        rectMode(CENTER);

        println("black");

    }
    public void draw(){
        if (redOn){
            r = on;
        }
        else{
            r = off;
        }
        if (greenOn){
            g = on;
        }
        else{
            g = off;
        }
        if (blueOn){
            b = on;
        }
        else{
            b = off;
        }
        background(r, g, b);


        // Keep the rectangles in view at all times
        stroke(128);
        strokeWeight(12);
        fill(255, 0, 0);
        rect(redRectCenterX, 250, 100, 100);   // red rectangle
        fill(0, 255, 0);
        rect(greenRectCenterX, 250, 100, 100);   // green rectangle
        fill(0, 0, 255);
        rect(blueRectCenterX, 250, 100, 100);   // blue rectangle

        // Black trim for each rectangle selected
        if (redOn){
            fill(255, 0 , 0, 0);
            stroke(0);
            strokeWeight(2);
            rect(redRectCenterX, 250, 100, 100);
        }
        if (greenOn){
            fill(0, 255 , 0, 0);
            stroke(0);
            strokeWeight(2);
            rect(greenRectCenterX, 250, 100, 100);
        }
        if (blueOn){
            fill(0, 0 , 255, 0);
            stroke(0);
            strokeWeight(2);
            rect(blueRectCenterX, 250, 100, 100);
        }
    }
    public void mousePressed(){

        // Note that you need to take HALF of the strokeWidth to create appropriate boundaries.
        // Need to also include mousePressed.
        boolean mouseInRed = mouseX > (redRectCenterX - halfRectWidth + halfStrokeWidth)
                && mouseX < (redRectCenterX + halfRectWidth - halfStrokeWidth) & mouseY > (200 + halfStrokeWidth)
                    && mouseY < (300 - halfStrokeWidth) && mousePressed;

        boolean mouseInGreen = mouseX > (greenRectCenterX - halfRectWidth + halfStrokeWidth)
                && mouseX < (greenRectCenterX + halfRectWidth - halfStrokeWidth) && mouseY > (200 + halfStrokeWidth)
                    && mouseY < (300 - halfStrokeWidth) && mousePressed;

        boolean mouseInBlue = mouseX > (blueRectCenterX - halfRectWidth + halfStrokeWidth)
                && mouseX < (blueRectCenterX + halfRectWidth - halfStrokeWidth) & mouseY > (200 + halfStrokeWidth)
                    && mouseY < (300 - halfStrokeWidth) && mousePressed;

        boolean mouseInRectangle = (mouseInRed || mouseInGreen || mouseInBlue);

        if (mouseInGreen){
            greenOn = !greenOn;
        }
        if (mouseInRed){
            redOn = !redOn;
        }
        if (mouseInBlue){
            blueOn = !blueOn;
        }

        if (redOn && greenOn && blueOn && mouseInRectangle){
           println("white");
        }
        if (redOn && greenOn && !blueOn && mouseInRectangle){
            println("yellow");
        }
        if (redOn && blueOn && !greenOn && mouseInRectangle){
            println("magenta");
        }
        if (greenOn && blueOn && !redOn && mouseInRectangle){
            println("cyan");
        }
        if (redOn && !greenOn && !blueOn && mouseInRectangle){
            println("red");
        }
        if (!redOn && greenOn && !blueOn && mouseInRectangle){
            println("green");
        }
        if ( !redOn && !greenOn && blueOn && mouseInRectangle){
            println("blue");
        }
        if (!redOn && !greenOn && !blueOn && mouseInRectangle) {
            println("black");
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.ColorButtons"});
    }
}

