package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * Conditionals
 */

import processing.core.PApplet;

public class Example_1 extends PApplet {

    float r = 150;
    float g = 0;
    float b = 0;

    public void setup(){
        size(500, 500);
        background(0);
    }

    public void draw(){
        background(r, g, b);
        stroke(255);
        line(width/2, 0, width/2, height);

        if(mouseX > width/2) {
            r += 1;
        }
            else{
                r -=1;
        }
        if (mouseX > width/2){ // keep red from exceeding bounds
            r = 255;
        }                       // Can also use constrain(r, 0, 255);
        else if (r < 0){
            r = 0;
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_1"});
    }
}