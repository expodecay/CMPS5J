package BookNotes.Chapter_6;
/**
 * Created by Rick on 10/29/2015.
 */

import processing.core.PApplet;

public class Example_3 extends PApplet {

    int endLegs = 150;
    int x = 50;
    int y = 80;
    int len = 100;
    int spacing = 20;

    public void setup(){
        size(500, 500);
        stroke(0);
    }
    public void draw(){
        while (x <= endLegs){  // if x < 150 keep iterating
            line(x, y, x, y+len);
            x = x+spacing;
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_6.Example_3"});
    }
}