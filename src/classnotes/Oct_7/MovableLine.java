package classnotes.Oct_7;
/**
 * Created by Rick on 10/7/2015.
 *
 * Movable Ellipse
 */

import processing.core.PApplet;


public class MovableLine extends PApplet {

    public void setup() {
        size(400, 400);
        rectMode(CORNERS);
        ellipseMode(CORNERS);
    }

    public void draw() {
        background(127);

        // Draw an ellipse amd its circumscribed rectangle
        fill(0, 255, 0);
        ellipse(100, 100, mouseX, mouseY);
        noFill();
        rect(100, 100, mouseX, mouseY);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_7.MovableLine"});
    }
}

