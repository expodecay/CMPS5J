package Assignments;
/**
 * Created by Rick on 10/23/2015.
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

    public void setup(){
        size(500, 500);
        rectMode(CENTER);
        smooth();

    }
    public void draw(){
        if (redOn){
            r = 255;
            background(r, g, b);
            strokeWeight(12);
            fill(r, g, b);
            rect(100, 250, 100, 100);
        }
        else{
            r = 0;
            background(r, g, b);
        }
        if (greenOn){
            g = 255;
            background(r, g, b);
        }
        else{
            g = 0;
            background(r, g, b);
        }
        if (blueOn){
            b = 255;
            background(r, g, b);
        }
        else{
            b = 0;
            background(r, g, b);
        }

        // Keep the rectangles in view at all times
        stroke(128);
        strokeWeight(12);
        fill(0, 255, 0);
        rect(250, 250, 100, 100);   // green rectangle
        fill(255, 0, 0);
        rect(100, 250, 100, 100);   // red rectangle
        fill(0, 0, 255);
        rect(400, 250, 100, 100);   // blue rectangle

        // Black trim for each rectangle selected
        if (redOn){
            fill(255, 0 , 0, 0);
            stroke(0);
            strokeWeight(2);
            rect(100, 250, 100, 100);
        }
        if (greenOn){
            fill(0, 255 , 0, 0);
            stroke(0);
            strokeWeight(2);
            rect(250, 250, 100, 100);
        }
        if (blueOn){
            fill(0, 0 , 255, 0);
            stroke(0);
            strokeWeight(2);
            rect(400, 250, 100, 100);
        }
    }
    public void mousePressed(){
        boolean mouseInGreen = mouseX > 212 && mouseX < 288 && mouseY > 212 && mouseY < 288 && mousePressed;
        boolean mouseInRed = mouseX > 62 && mouseX < 138 & mouseY > 212 && mouseY < 288 && mousePressed;
        boolean mouseInBlue = mouseX > 362 && mouseX < 438 & mouseY > 212 && mouseY < 288 && mousePressed;

        if (mouseInGreen){
            greenOn = !greenOn;
        }
        if (mouseInRed){
            redOn = !redOn;
        }
        if (mouseInBlue){
            blueOn = !blueOn;
        }
       if (redOn && greenOn && blueOn && (mouseInRed || mouseInGreen || mouseInBlue) ){
           println("white");
       }
        if (redOn && greenOn && !blueOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("yellow");
        }
        if (redOn && blueOn && !greenOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("magenta");
        }
        if (greenOn && blueOn && !redOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("cyan");
        }
        if (redOn && !greenOn && !blueOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("red");
        }
        if (!redOn && greenOn && !blueOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("green");
        }
        if ( !redOn && !greenOn && blueOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("blue");
        }
        if (!redOn && !greenOn && !blueOn && (mouseInRed || mouseInGreen || mouseInBlue)){
            println("black");
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.ColorButtons"});
    }
}

