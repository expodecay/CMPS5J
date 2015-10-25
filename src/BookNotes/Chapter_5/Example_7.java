package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 *
 * Bouncing Color
 */

import processing.core.PApplet;

public class Example_7 extends PApplet {

    float c1 = 0;
    float c2 = 255;

    float c1dir = 0.1f;
    float c2dir = -0.1f;

    public void setup(){
        size(200, 200);
    }
    public void draw(){
        noStroke();

        // Draw rectangle on left
        fill(c1, 0, c2);
        rect(0, 0, 100, 200);

        // Draw rectangle on right
        fill(c2, 0, c1);
        rect(100, 0, 100, 200);

        // Adjust color values
        c1 += c1dir;
        c2 += c2dir;

        // Reverse direction of color change
        if (c1 < 0 || c1 > 255){
            c1dir *= -1;
        }
        if ( c2 < 0 || c2 > 255){
            c2dir *=-1;
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_7"});
    }
}