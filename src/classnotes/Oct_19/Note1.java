package classnotes.Oct_19;
/**
 * Created by Rick on 10/19/2015.
 */
/*
* Quiz up to chapter 5.
* Just make sure that you understand each example.
* For pa4 be sure to print most recent color in consol
* */
import processing.core.PApplet;

public class Note1 extends PApplet {
    //---------------------------------------------------------
// Bounce.pde
//---------------------------------------------------------

    int diam = 50;       // diameter of circle
    float  xpos, ypos;    // center of circle

    float xspeed = 1.8f;  // horizontal speed
    float yspeed = 1.2f;  // vertical speed

    int xdirection = 1;  // left (-1) or right (+1)
    int ydirection = 1;  // up (-1) or down (+1)

    public void setup()
    {
        size(600, 200);
        noStroke();

        // starting position in center of screen
        xpos = width/2;
        ypos = height/2;
    }

    public void draw()
    {
        background(102);

        // update position
        xpos = xpos + ( xspeed * xdirection );
        ypos = ypos + ( yspeed * ydirection );

        // reverse direction if exceeding boundary
        if (xpos > width-diam/2 || xpos < diam/2) {
            xdirection *= -1;
        }
        if (ypos > height-diam/2 || ypos < diam/2) {
            ydirection *= -1;
        }

        // draw circle
        ellipse(xpos, ypos, diam, diam);
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_19.Note1"});
    }
}

/*
*
* */