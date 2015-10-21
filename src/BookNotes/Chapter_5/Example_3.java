package BookNotes.Chapter_5;
/**
 * Created by Rick on 10/20/2015.
 */

import processing.core.PApplet;

public class Example_3 extends PApplet {

    public void setup(){
        size(200, 200);
    }
    public void draw() {
        background(255);
        stroke(0);
        line(100, 0, 100, 200);
        line(0, 100, 200, 100);

        // Fill a black color
        noStroke();
        fill(0);

        if (mouseX < 100 && mouseY < 100) {
            rect(0, 0, 100, 100);
        }
        else if(mouseX > 100 && mouseY < 100) {
            rect(100, 0, 100, 100);
        }
        else if(mouseX < 100 && mouseY >100){
            rect(0, 100, 100, 100);
        }
        else if(mouseX > 100 && mouseY > 100){
            rect(100, 100, 100, 100);
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_5.Example_3"});
    }
}