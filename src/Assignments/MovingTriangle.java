package Assignments;
/**
 * Created by Rick on 12/1/2015.
 */

import processing.core.PApplet;

public class MovingTriangle extends PApplet {
    //--------------------------------------------------------------
// SquareFollowingEdge (example 5-8 in Learning Processing)
//--------------------------------------------------------------

    int x = 0;  // x location of square
    int y = 0;  // y location of square

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 400;
    int e = 400;
    int f = 400;

    int speed = 3;  // speed of square
    int state = 1;  // "state" of square (0, 1, 2, or 3)

    public void setup() {
        size(400,400);
        //frameRate(10);
    }

   public void draw() {
       background(0, 255, 0);
       fill(255,0,255);
       triangle(a, b, c, d, e, f);

        // Display the square
        stroke(0);
        fill(0);
        // change position, change state if necessary
        if (state == 1) {        // moving left to right
            a += speed;
            if (a > width && c == 0) {    // if right side hit, change state
                a = width;
                state = 2;
            }
        }
        else if (state == 2) { // moving top to bottom
            d -= speed;
            if (d < 0) {   // if bottom hit, change state
                d = 0;
                state = 3;
            }
        }
        else if (state == 3) { // moving right to left
            e -= speed;
            if (e < 0) {           // if left side hit, change state
                e = 0;
                state = 4;
            }
        }
        else if (state == 4) { // moving bottom to top
            b += speed;
            if (b > height) {           // if top hit, change state
                b = height;
                state = 1;
                a = c;
                b = d;
                c = e;
                d =  f;
                e = 400;
                f = 400;
            }

        }
    }
    public void mousePressed(){
        state *= -1;
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.MovingTriangle"});
    }
}