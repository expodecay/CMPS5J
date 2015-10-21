package BookNotes;
/**
 * Created by Rick on 10/19/2015.
 */

import processing.core.PApplet;

public class Example_6 extends PApplet {

    int x = 0;
    int speed = 1;

    public void setup(){
        size(200, 200);
        smooth();
    }
    public void draw(){
        background(255);
        x = x + speed;
        if ((x > width) || (x<0)){
            speed = speed * -1;
        }
    stroke(0);
        fill(175);
        ellipse(x, 100, 32, 32);
    }



    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Example_6"});
    }
}

