package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/20/2015.
 *
 * Example using system variables
 */

import processing.core.PApplet;

public class Example_5 extends PApplet {

    public void setup(){
        size(200, 200);
        frameRate(30);
    }

    public void draw(){
        background(100);
        stroke(255);
        fill(frameCount / 2);
        rectMode(CENTER);
        rect(width/2, height/2, mouseX+10, mouseY+10);
    }

    public void keyPressed(){
        println(key);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_5"});
    }
}
/*
* SYSTEM VARIABLES:
*   width
*   height
*   frameCount
*   frameRate
*   screen.width
*   screen.height
*   key
*   keyCode
*   keyPressed
*   mousePressed
*   mouseButton
*
* If you inadvertently give a variable the same name as a System Variable, your variable will override the system.
*
* */