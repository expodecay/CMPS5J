package BookNotes.Chapter_1.Section_5;
/**
 * Created by Rick on 10/5/2015.
 */

import processing.core.PApplet;


public class ColorTransparency extends PApplet {

    public void setup(){
        size(500, 500);
        background(0);
        noStroke();

        fill(0, 0, 255);  // no fourth -> 100% opacity  (alpha values range form 0 to 255)
        rect(0, 0, 100, 200);

        fill(255, 0, 0, 255); // 255 -> 100% opacity
        rect(0, 0, 200, 40);

        fill(255, 0, 0, 191); // 75%
        rect(0, 50, 200, 40);

        fill(255, 0, 0, 127); // 50%
        rect(0, 100, 200, 40);

        fill(255, 0, 0, 63); // 25%
        rect(0, 150, 200, 40);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_1.Section_5.ColorTransparency"});
    }
}

