package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/13/2015.
 */

import processing.core.PApplet;

public class Example_4 extends PApplet {
    float circleX = 0;
    float circleY = 0;
    float circleW = 50;
    float circleH = 100;
    float circleStroke = 255;

    float circleFill_R = 0;
    float circleFill_G = 0;
    float circleFill_B = 0;

    float backgroundColor = 255;
    double change = 0.5;

    public void setup(){
        size(500, 500);
        smooth();
    }

    public void draw(){
        // Draw the background and the ellipse
        background(backgroundColor);
        stroke(circleStroke);
        fill(circleFill_R, circleFill_G, circleFill_B);
        ellipse(circleX, circleY, circleW, circleH);

        // Change the values of all variables
        circleX += change;
        circleY += change;
        circleW += change;
        circleH += change;
        circleStroke -= change;
        circleFill_B += change;
        circleFill_G += change*2;

    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_4"});
    }
}

