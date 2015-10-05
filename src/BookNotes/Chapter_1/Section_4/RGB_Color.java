package BookNotes.Chapter_1.Section_4; /**
 * Created by Rick on 10/5/2015.
 */

import processing.core.PApplet;


public class RGB_Color extends PApplet {
    public void setup(){
        size(500, 500);
        background(255);
        noStroke();

        fill(255, 0, 0); // Bright red          fill(R, G, B)
        ellipse(20, 20, 16, 16);

        fill(127, 0, 0);  // Dark red
        ellipse(40, 20, 16, 16);

        fill(255, 200, 200);  //Pink
        ellipse(60, 20, 16, 16);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_1.Section_4.RGB_Color"});
    }
}
/*
* Note that processing PDE has color selector. Access via TOOLS -> COLOR SELECTOR
* */
