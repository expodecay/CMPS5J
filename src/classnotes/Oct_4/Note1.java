package classnotes.Oct_4;
/**
 * Created by Rick on 10/5/2015.
 */
/*
* Quiz at the END of class. Consists of everything that has been TALKED about in class.
* Know the default orientations of rectangle and ellipse mode, etc.
* */
import processing.core.PApplet;

public class Note1 extends PApplet {

    /* Review of RGB */
    public void setup(){
        size(500, 500);
        background(0, 255, 0); // green background

        fill(255, 0, 255, 128); // complementary to the background color with half opacity
                                // looks gray (instead of magenta) because they are complementary colors (The sum of the for/back ground)
        strokeWeight(5); // Thickens the boundary
        ellipse(250, 250, 100, 100); // (250, 250) In the middle of the screen we created

        colorMode(HSB, 360, 100, 100); // Red = 360, Green = 120, Blue = 240
        fill(360, 100, 100); // fill(H, S, B)
        strokeWeight(5);
        ellipse(125, 125, 100, 100);
        /*
        Should be able to use this technique in PDE
         fill(#B437FF);
        strokeWeight(5);
        ellipse(350, 350, 100, 100);
        * */
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"classnotes.Oct_4.Note1"});
    }
}

/*
* The four argument version is fill(R, G, B, Alpha) where alpha is the opacity.
*       Alpha = 0 -> completely transparent  ;   Alpha = 255 -> completely opaque
* Note that fill(R,G,B,0) = fill(R,G,B)
*
* HSB colors:
*   colorMode(HSB, 360, 100, 100) -> same as fill(Hue, Saturation, Brightness)
*   Note the 360: Represents a color wheel
*
*   To find color selector in intellij, hit CTRL+SHIFT+A  and select 'color picker'
* */