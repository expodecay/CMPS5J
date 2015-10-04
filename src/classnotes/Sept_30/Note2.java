package classnotes.Sept_30;
/**
 * Created by Rick on 9/30/2015.
 */

import processing.core.PApplet;


public class Note2 extends PApplet {

    public void setup(){
        size(500, 500);
        background(220);

        rectMode(CORNER); // default
        strokeWeight(5);
        rect(100, 100, 300, 200);

        rectMode(CORNER);
        strokeWeight(20);
        fill(80);
        rect(100, 100, 300, 200);

        rectMode(CENTER);
        stroke(100);
        strokeWeight(10);
        fill(200);
        rect(200, 350, 75,400);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Sept_30.Note2"});
    }
}

/*
* pay attention to the layering, and coordinates of each rectangle.
* */