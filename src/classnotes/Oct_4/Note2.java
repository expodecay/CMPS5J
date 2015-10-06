package classnotes.Oct_4;
/**
 * Created by Rick on 10/5/2015.
 *
 * Based on chapter 3
 */

import processing.core.PApplet;
/*  Interaction/Motion  */
public class Note2 extends PApplet {

    public void setup(){
        size(400, 400);
        background(150);
        smooth(); // makes smooth curves and lines (removes jaggedness)
    }

    public void draw(){
        background(150); // must be here to erase old lines.

        line(100, 100, mouseX, mouseY); // System variables: mouseX and mouseY (line ends at mouse coordinates)

        println("mouseX = " + mouseX + ", mouseY = " + mouseY); //prints position of mouse at 60 frames/sec
    }


    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_4.Note2"});
    }
}
/*
* To create moving pictures, we continually redraw the processing window.
* Static programs don't have setup() and draw(), but dynamic programs do.
* Using builtin functions:
*       setup()
*           everything that occurs once
*       draw()
*           everything that is done on each frame
*
* A typical processing program looks like:
*
*       // Comments
*       // Name of file
*       // Name of author
*
*       void setup(){
*           // Initialization commands
*           // executed once
*       }
*
*       void draw(){
*           // Commands to be executed on each frame.
*           // executed repeatedly (to draw subsequent frames)
*           // default frame rate = 60 frames/sec
*       }
*
*
* */