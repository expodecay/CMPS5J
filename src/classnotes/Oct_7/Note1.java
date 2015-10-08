package classnotes.Oct_7;
/**
 * Created by Rick on 10/7/2015.
 */

import processing.core.PApplet;


public class Note1 extends PApplet {
    public void setup(){
        size(400, 400);
        background(150);
    }
    public void draw(){
        background(150);

        stroke(255, 0, 0);
        strokeWeight(abs(mouseX - pmouseX)); // Changes thickness depending on how fast the user moves the mouse in X-direction
        // strokeWeight(mouseX); // Thickness changes depending on X location

        line(pmouseX, pmouseY, mouseX, mouseY);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_7Note1"});
    }
}

