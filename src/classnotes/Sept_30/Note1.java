package classnotes.Sept_30;
/**
 * Created by Rick on 9/30/2015.
 */

import processing.core.PApplet;


public class Note1 extends PApplet {
    public void setup(){

        size(500, 500);

        background(255);

        stroke(255);
        point(350, 350);

        point(200, 200);

        line(100, 100, 300, 300); // line(x1, y1, x2 y2 )

        stroke(125); // changes the color
        strokeWeight(10); // makes 10 pixels wide
        line(100,  100, 100, 300);

        strokeWeight(20);
        stroke(0);
        line(100, 100, 300, 100);

    }
/*
* processing coordinate:
*       The origin is taken to me the top left of the screen with the positive y-axis downward.
*
* How processing runs:
*       First command is bottom layer. As the program runs from top to bottom, the most recent changes appear on top.
*       Spaces don't do anything. Commands can be places in the same line, but hinders readability. Java is a "free format"
*       language, therefore, the amount of whitespace doesn't matter. This style helps with the human reader.
* */

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Sept_30.Note1"});
    }
}

