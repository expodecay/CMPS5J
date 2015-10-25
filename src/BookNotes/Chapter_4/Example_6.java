package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/20/2015.
 *
 * demonstrates random()
 * Extends to example 4.7
 */

import processing.core.PApplet;

public class Example_6 extends PApplet {

    float r;
    float g;
    float b;
    float a;

    float diam;
    float x;
    float y;
    public void setup(){
        size(200, 200);
        background(0);
        smooth();
    }
    public void draw(){
        r = random(255);
        g = random(255);
        b = random(255);
        a = random(255);
        diam = random(20);
        x = random(width);
        y = random(height);

        noStroke();
        fill(r, g, b, a);
        ellipse(x, y, diam, diam);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_6"});
    }
}
/*
* random() takes two parameters as lower and upper limits. If one argument is used, random() will assume that the range
* is from 0 to the value of the argument.
*
* random() returns floats. To return an integer, you need to cast it to an int.
*   Example:
*       int w = (int) random(1, 100);
*
*       or
*
*       int w = int(random(1, 100));
*       rect(100, 100, w, 50);
*
*       or
*
*       rect(100, 100, int(random(1, 100)), 50);
* */