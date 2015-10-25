package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * Square following edge, uses a "state" veriable
 */

import processing.core.PApplet;

public class Example_8 extends PApplet {

    int x = 0;
    int y = 0;

    int speed = 5;

    int state = 0;

    public void setup(){
        size(200, 200);
    }
    public void draw(){
        background(100);

        // Display the square
        noStroke();
        fill(255);
        rect(x, y, 10, 10);

        if (state == 0) {
            x += speed;
            if (x > width - 10) {
                x = width - 10;
                state = 1;
            }
        }
        else if (state == 1) {
            y += speed;
            if (y > height - 10) {
                y = height - 10;
                state = 2;
            }
        }
        else if (state == 2){
            x -= speed;
            if ( x < 0){
                x = 0;
                state = 3;
            }
        }
        else if (state == 3){
            y -= speed;
            if (y < 0){
                y = 0;
                state = 0;
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_8"});
    }
}