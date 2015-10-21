package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * A button
 */

import processing.core.PApplet;

public class Example_4 extends PApplet {

    boolean button = false;

    int x = 50;
    int y = 50;
    int w = 100;
    int h = 75;

    public void setup(){
        size(200, 200);
    }
    public void draw(){
        if (mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h && mousePressed){
            button = true;
        }
        else{
            button = false;
        }
        if (button){
            background(255);
            stroke(0);
        }
        else{
            background(0);
            stroke(255);
        }
        fill(175);
        rect(x, y, w, h);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_4"});
    }
}