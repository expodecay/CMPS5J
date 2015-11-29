package BookNotes.Chapter_8;
/**
 * Created by Rick on 11/27/2015.
 */

import processing.core.PApplet;

public class CarNonObject extends PApplet {
    int c;
    int xpos;
    int ypos;
    int xspeed;
    public void setup() {
        size(200, 200);
        c = color(255);
        xpos = width/2;
        ypos = height/2;
        xspeed = 1;
    }
    public void draw(){
        background(0);
        display();
        drive();
    }
    public void display(){
        rectMode(CENTER);
        fill(c);
        rect(xpos,ypos,20,10);
    }
    public void drive(){
        xpos += xspeed;
        if(xpos > width){
            xpos = 0;
        }
    }
    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_8.CarNonObject"});
    }
}