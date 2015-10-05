package classnotes.Sept_30;
/**
 * Created by Rick on 9/30/2015.
 *
 * Primitive shapes
 */

import processing.core.PApplet;


public class Note2 extends PApplet {

    public void setup(){
        size(500, 500); // sets window size
        background(220); // sets background color

        /* Rectangles */
        rectMode(CORNER); // default with rect()
        strokeWeight(5); // thickness of outline      strokeWeight(number of pixels)
        rect(100, 100, 300, 200); // rect(top left x, top left y, width, height)

        rectMode(CORNERS);
        strokeWeight(20);
        fill(80);  // gray scale for interior (black = 0 , white = 255)
        rect(100, 100, 300, 200); // rect(top left x, top left y, bottom right x, bottom right y)

        rectMode(CENTER);
        stroke(100); // gray scale for outline
        strokeWeight(10);
        fill(200);
        rect(200, 350, 75,400); // rect(center x, center y, width, height)

        /* Ellipses */
        ellipseMode(CENTER); // default with ellipse()
        ellipse(100, 100, 100, 100); // coordinates for bounding box

        ellipseMode(CENTER);
        stroke(0);
        strokeWeight(5);
        fill(255);
        ellipse(400, 400, 100, 100);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Sept_30.Note2"});
    }
}

/*
* pay attention to the layering, and coordinates of each rectangle. Notice how objects can extend out of the frame.
*
* By default, rectangles are specified by their coordinate for the top left (x,y) coordinates, followed by with and height.
* By default, processing will use black(0) for stroke() and white(255) for fill().
* Stroke() and fill() can be eliminated with noStroke() and noFill(), but don't eliminate both, or nothing will appear.
* */