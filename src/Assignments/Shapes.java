package Assignments;
/**
 * Created by Rick on 10/9/2015.
 */

import processing.core.PApplet;

public class Shapes extends PApplet {

    public void setup(){


        size(500, 500);
        background(255, 250, 49);

        ellipseMode(CENTER);
        rectMode(CENTER);
        fill(0, 0, 125);
        stroke(0);

        strokeWeight(10);


        rect(250, 250, 400, 400);
        fill(135, 214, 255);
        ellipse(250, 250, 400, 400);

        strokeWeight(9);
        fill(0, 0, 125);
        rect(250, 250, 350, 350);
        fill(135, 214, 255);
        ellipse(250, 250, 350, 350);

        strokeWeight(8);
        fill(0, 0, 125);
        rect(250, 250, 300, 300);
        fill(135, 214, 255);
        ellipse(250, 250, 300, 300);

        strokeWeight(7);
        fill(0, 0, 125);
        rect(250, 250, 250, 250);
        fill(135, 214, 255);
        ellipse(250, 250, 250, 250);

        strokeWeight(6);
        fill(0, 0, 125);
        rect(250, 250, 200, 200);
        fill(135, 214, 255);
        ellipse(250, 250, 200, 200);

        strokeWeight(5);
        fill(0, 0, 125);
        rect(250, 250, 150, 150);
        fill(135, 214, 255);
        ellipse(250, 250, 150, 150);

        strokeWeight(4);
        fill(0, 0, 125);
        rect(250, 250, 100, 100);
        fill(0, 2255, 0);
        ellipse(250, 250, 100, 100);

        strokeWeight(2);
        line(0, 0, 500, 500);
        line(0, 500, 500, 0);

        strokeWeight(3);
        fill(0, 0, 125);
        rect(250, 250, width/20, height/20);

        fill(0, 0, 255, 127);
        triangle(250, 250, 0, 50, 0, 450);
        triangle(250, 250, 500, 50, 500, 450);
        triangle(250, 250, 50, 0, 450, 0);
        triangle(250, 250, 50, 500, 450, 500);

    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.Shapes"});
    }
}

