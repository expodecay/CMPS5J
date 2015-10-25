package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/20/2015.
 *
 * variable Zoog
 */

import processing.core.PApplet;

public class Example_7 extends PApplet {

    float zoogX;
    float zoogY;

    float eyeR;
    float eyeG;
    float eyeB;

    public void setup(){
        size(200, 800);
        zoogX = width/2;
        zoogY = height + 100;
    }
    public void draw(){
        background(255);

        ellipseMode(CENTER);
        rectMode(CENTER);

        stroke(0);
        fill(150);
        rect(zoogX,zoogY, 20, 100);

        stroke(0);
        fill(255);
        ellipse(zoogX, zoogY-30, 60, 60);

        eyeR = random(255);
        eyeG = random(255);
        eyeB = random(255);
        fill(eyeR, eyeG, eyeB);

        ellipse(zoogX - 19, zoogY-30, 16, 32);
        ellipse(zoogX + 19, zoogY - 30, 16, 32);

        stroke(150);
        line(zoogX - 10, zoogY + 50, zoogX-10, height);
        line(zoogX+10, zoogY+50, zoogX+10, height);

        zoogY -= 1;
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_7"});
    }
}