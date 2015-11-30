package BookNotes.Chapter_8;
/**
 * Created by Rick on 11/27/2015.
 */

import processing.core.PApplet;

public class BugObject extends PApplet {

// BugHunt
// CMPS 5J
// pa7

    int n = 30;            // number of bugs
    Bug[] B = new Bug[n];  // bug array
    int clickCount = 0;
    int deadCount = 0;
    float killRate;

    public void setup(){
        size(500,500);
        smooth();
        for(int i=0; i<n; i++){
            B[i] = new Bug(random(20,480),random(20,480),(int)random(1,5));
        }
    }

   public  void draw(){
        background(170);
        for(int i=0; i<n; i++){
            B[i].display();
            B[i].crawl();
        }
    }

    public void mousePressed(){
        clickCount++;
        for(int i=0; i<n; i++){
            if( B[i].mouseOn() ){
                B[i].squash();
                deadCount++;
            }else if( B[i].scared() ){
                B[i].runAway();
            }
        }
        killRate = (float)(deadCount)/clickCount;
        println("kill rate = "+killRate+" bugs per click");
    }
    class Bug {
        // fields
        int BugLength = 30;
        int BugWidth = 20;
        float x;
        float y;
        int s;
        float speed;
        float distance;
        int c;

        // constructor
        Bug(float tempX, float tempY, int tempS) {
            x = tempX;
            y = tempY;
            s = tempS;
            c = color(random(255), random(255), random(255));
            speed = random(1, 1.5f);
        }
        // methods
        void crawl() {
            if (s == 1) {
                x += speed;
                if (x > width + BugLength) {
                    x = 0 - 2*BugLength;
                }
            }
            if (s == 2) {
                x -= speed;
                if (x < 0 - BugLength) {
                    x = width + BugLength;
                }
            }
            if (s == 3) {
                y += speed;
                if (y > height + BugLength) {
                    y = 0 - BugLength;
                }
            }
            if (s == 4) {
                y -= speed;
                if (y < 0 - BugLength) {
                    y = height + BugLength;
                }
            }
        }

        void display() {
            if (s == 1) {
                fill(c);
                ellipseMode(CENTER);
                for (float i = x-BugWidth/2; i < x+BugLength/2; i+=10){
                    stroke(0);
                    line(i,y-15, i, y+15);
                }
                ellipse(x, y, BugLength, BugWidth);
            }
            if (s == 2) {
                fill(c);
                ellipseMode(CENTER);
                for (float i = x-BugLength/2; i < x+BugWidth/2; i+=10){
                    stroke(0);
                    line(i+5,y-15, i+5, y+15);
                }
                ellipse(x, y, BugLength, BugWidth);
            }
            if (s == 3) {
                fill(c);
                ellipseMode(CENTER);
                for (float i = y-BugWidth/2; i < y+BugLength/2; i+=10){
                    stroke(0);
                    line(x-15,i, x+15, i);
                }
                ellipse(x, y, BugWidth, BugLength);
            }
            if (s == 4) {
                fill(c);
                ellipseMode(CENTER);
                for (float i = y-BugLength/2; i < y+BugWidth/2; i+=10){
                    stroke(0);
                    line(x-15,i+5, x+15, i+5);
                }
                ellipse(x, y, BugWidth, BugLength);
            }
        }
        void squash() {
           if (mouseOn()){
               s = 0;
           }
        }
        void runAway() {
            if (scared() && mousePressed){
                speed *= 1.5;
                println("scared");
            }
        }
        boolean mouseOn() {
            // if bug is alive and mouse within 15 pixels of center.
            return (abs(dist(x, y, mouseX, mouseY)) < 15);
        }
        boolean scared() {
            // if mouse within 30 pixels of center.
            return (abs(dist(x, y, mouseX, mouseY)) < 30);
        }
    }
    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_8.BugObject"});
    }
}