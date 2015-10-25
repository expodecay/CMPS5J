package classnotes.Oct_21;
/**
 * Created by Rick on 10/21/2015.
 */

/*
* Note that x and y are the center of the rectangle. X and Y are measured in pixels.
* */

import processing.core.PApplet;

public class Note_2 extends PApplet {
//------------------------------------------------------------------
// GravityBounce (example 5-9 in Learning Processing)
//------------------------------------------------------------------

    float x;      // x coordinate of square
    float y;      // y coordinate of square
    float speed = 0;  // speed of square

    // A new variable, for gravity (i.e. acceleration).  We use a
// relatively small number (0.1) because this acceleration will
// accumulate over time, increasing the speed.  Try changing
// this number to 2.0 and see what happens.
    float gravity = 0.1f;       // Positive downward (could be initialized in setup() if you choose))

    public void setup() {
        size(400,400);
        x = width/2;
        y = 5;
    }
    public void draw() {
        background(255);

        // Display the square
        fill(0);            //
        stroke(0);          // Can all be in setup() since none of it changes
        rectMode(CENTER);   //
        rect(x,y,10,10);

        y += speed;       // add speed to location
        speed += gravity; // add gravity (acceleration) to speed

        if (y > height-5) {  // hit bottom, so reverse direction
            speed = speed*(-0.93f);
            // Multiplying by -0.93 instead of -1 slows the square down
            // each time it bounces (by decreasing speed).  This is known
            // as a "dampening" effect and is a more realistic simulation
            // of the real world (without it, a ball would bounce forever).
            // Try playing with this parameter, for instance try numbers in
            // the range -0.5 to -1.5.
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_21.Note_2"});
    }
}

/*
* On frame 1, we are adding zero pixels to y. After the value of y changes, speed changes by adding gravity to it.
 * So on every frame, we add gravity to speed. Gravity doesn't change and is always positive. Speed changes between
 * negative and positive; slowing down on way up, and speeding up on way down.
 *
 * When we hit the bottom, the sign of speed needs to change by multiplying by a negative number. We can't just multiply
 * by negative one though because we need to lose energy on each bounce.
* */