package classnotes.Oct_28;
/**
 * Created by Rick on 10/28/2015.
 *
 */

import processing.core.PApplet;

public class ColorLoop3 extends PApplet {
//------------------------------------------------------------
//                  ColorLoop3.pde
//------------------------------------------------------------

    int i, j, n, m;
    float c;
    float x, y, w, h;

    public void setup(){
        size(500,500);
        smooth();
        background(255);
        n = 50;  // number of columns
        m = 50;  // number of rows
        x = y = 0;
        w = width/(float)(n);   // Width pro window divided by # of columns
        h = height/(float)(m);  // Float division is ensured -int would have no fractional answer and could produce gaps
        rectMode(CORNER);
        colorMode(HSB,n+m-2,100,100); // Color wheel HUE ranges 0 to n+m-2, with full saturation and brightness.
    }

    public void draw(){
        for( i=0; i<n; i++){ // Controls column
            for( j=0; j<m; j++){    // Controls row
                c = i+j;        // What color we fill with (produces HUE on this scale)
                //noStroke();
                fill(c,100,100);
                rect(x+w*i, y+h*j, w, h);
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_28.ColorLoop3"});
    }
}

/*
* When i = j = 0, we're in upper left corner.
*
* jmax = n-1 and imax = m-1
*   largest sum is n + m - 2 (That's where HUE parameter comes from-> Same value as C in loop)
* */