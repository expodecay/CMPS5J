package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * Button as a switch
 */

import processing.core.PApplet;

public class Example_5 extends PApplet {

    boolean button = false;

    int x = 50;
    int y = 50;
    int w = 100;
    int h = 75;

    public void setup(){
        size(200, 200);
    }
    public void draw(){
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
    public void mousePressed(){
        if (mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h && mousePressed){

            button = !button;   // Reverse whatever boolean value button currently has
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_5"});
    }
}

/*
* For the button to act as a switch, we need to move the control statement to mousePressed() because it is executed only
* once when called; unlike the function draw().
*
* Two ways to toggle between on and off:
*
*   if(button){
*       button = false;
*   }
*   else{
*       button = true;
*   }
*
*   or
*
*   button = !button;
* */