package classnotes.Oct_28;
/**
 * Created by Rick on 10/28/2015.
 */

import processing.core.PApplet;

public class Shade extends PApplet {
//------------------------------------------------------------
//                  Shade.pde
// based on example 6-9 in learning processing
//------------------------------------------------------------

    int i, j, n, m;
    float grayShade;
    float diag; // if we change screen, keeps everything proportional

    public void setup() {
        size(500,500);
        smooth();
        // Height and width are fixed in this example
        n = width/10;  // number of columns
        m = height/10; // number of rows

        // dist() calculates distance between two points by Pythagorean Theorem.
        diag = dist(0,0,width,height); // upper left to lower right

        //noStroke();
    }

    public void draw() {
        for(i=0; i<n; i++){ // Column loop
            for(j=0; j<m; j++){ // Row loop
                grayShade = 255*5*dist(mouseX,mouseY,i*10,j*10)/diag;
                fill(grayShade);
                rect(i*10,j*10,10,10);
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_28.Shade"});
    }
}

