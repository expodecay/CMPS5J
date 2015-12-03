package Assignments;
/**
 * Created by Rick on 12/1/2015.
 */

import processing.core.PApplet;

public class MovingTriangle extends PApplet {


    int x = 0;
    int y = 0;

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 400;
    int e = 400;
    int f = 400;

    int speed = 3;
    int state = 1;

    public void setup() {
        size(400,400);
    }

   public void draw() {
       background(0, 255, 0);
       fill(255,0,255);
       triangle(a, b, c, d, e, f);


        stroke(0);


        if (state == 1) {
            a += speed;
            if (a > width && c == 0) {
                a = width;
                state = 2;
            }
        }
        else if (state == 2) {
            d -= speed;
            if (d < 0) {
                d = 0;
                state = 3;
            }
        }
        else if (state == 3) {
            e -= speed;
            if (e < 0) {
                e = 0;
                state = 4;
            }
        }
        else if (state == 4) {
            b += speed;
            if (b > height) {
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