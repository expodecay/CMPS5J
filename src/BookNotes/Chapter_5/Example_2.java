package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * More conditionals
 */

import processing.core.PApplet;

public class Example_2 extends PApplet {

    float r = 0;
    float b = 0;
    float g = 0;

    public void setup(){
        size(200, 200);
    }
    public void draw(){
        background(r, g, b);
        stroke(0);

        line(width/2, 0, width/2, height);
        line(0, width/2, width, height/2);

        if (mouseX > width/2){
            r += 1;
        }
        else{
            r -= 1;
        }
        if (mouseY > height/2){
            b += 1;
        }
        else{
            b -= 1;
        }
        if(mousePressed){
            g += 1;
        }
        else{
            g -= 1;
        }
        r = constrain(r, 0, 255);
        g = constrain(g, 0, 255);
        b = constrain(b, 0, 255);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_2"});
    }
}