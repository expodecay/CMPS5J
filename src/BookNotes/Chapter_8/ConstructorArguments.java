package BookNotes.Chapter_8;
/**
 * Created by Rick on 11/27/2015.
 */

import processing.core.PApplet;

public class ConstructorArguments extends PApplet {
    car ass1;
    car ass2;
    public void setup(){
        size(200,200);
        ass1 = new car(color(random(255),random(255),random(255)), 0, 100, 2);
        ass2 = new car(color(random(255),random(255),random(255)), 0, 10, 1);
    }
    public void draw(){
        background(0);
        ass1.drive();
        ass1.display();
        ass2.drive();
        ass2.display();
    }
    class car{
        int c;
        float xpos;
        float ypos;
        float xspeed;

        // Constructor
        car(int tempC, float tempxpos, float tempypos, float tempxspeed){
            c = tempC;
            xpos = tempxpos;
            ypos = tempypos;
            xspeed = tempxspeed;
        }
         void display(){
            ellipseMode(CENTER);
            fill(c);
            ellipse(xpos,ypos,30,20);
        }
         void drive(){
            xpos += xspeed;
            if (xpos > width){
                xpos = 0;
            }
        }
    }
    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_8.ConstructorArguments"});
    }
}