package classnotes.Oct_21;
/**
 * Created by Rick on 10/21/2015.
 */

import processing.core.PApplet;

public class Note_1 extends PApplet {
    //--------------------------------------------------------------
// SquareFollowingEdge (example 5-8 in Learning Processing)
//--------------------------------------------------------------

    int x = 0;  // x location of square
    int y = 0;  // y location of square

    int speed = 10;  // speed of square
    int state = 0;  // "state" of square (0, 1, 2, or 3)

    public void setup() {
        size(400,400);
        //frameRate(10);
    }

    public void draw() {
        background(255);

        // Display the square
        stroke(0);
        fill(0);
        rect(x,y,9,9);

        // change position, change state if necessary
        if (state == 0) {        // moving left to right
            x += speed;
            if (x > width-10) {    // if right side hit, change state
                x = width-10;
                state = 1;
            }
        } else if (state == 1) { // moving top to bottom
            y += speed;
            if (y > height-10) {   // if bottom hit, change state
                y = height-10;
                state = 2;
            }
        } else if (state == 2) { // moving right to left
            x -= speed;
            if (x < 0) {           // if left side hit, change state
                x = 0;
                state = 3;
            }
        } else if (state == 3) { // moving bottom to top
            y -= speed;
            if (y < 0) {           // if top hit, change state
                y = 0;
                state=0;
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_21.Note_1"});
    }
}

