package Assignments;
/**
 * Created by Rick on 10/15/2015.
 */

import processing.core.PApplet;

public class active extends PApplet {
    // Rick Ramirez
    // riryrami
    // cmps 5J
    //pa3

    int leftX = 0;
    int topY = 0;
    int bottomX = 500;
    int bottomY = 500;
    int WIDTH = 1;
    int HEIGHT = 1;
    int X = 10;
    int Y = 10;

    public void setup(){
        size(500, 500);
        background(0);
        smooth();
        rectMode(CENTER);
        frameRate(30);
    }
    public void draw(){
        stroke(1);
        fill(255, 0, 0, 255 - WIDTH);
        ellipse(leftX, topY, WIDTH, HEIGHT);
        fill(0, 0, 255, 255-WIDTH);
        ellipse(bottomX, bottomY, WIDTH, HEIGHT);
        fill(0, 255, 0, 255-WIDTH);
        ellipse(bottomX, topY, WIDTH, HEIGHT);
        fill(255, 0, 255, 255-WIDTH);
        ellipse(leftX, bottomY, WIDTH, HEIGHT);

        WIDTH += 10;
        HEIGHT += 10;
        leftX += X;
        topY += Y;
        bottomX -= X;
        bottomY -= Y;
    }
    public void mousePressed(){ // Initiated when mouse is pressed or pressed and held
        stroke(1);
        fill(255, 255, 0);
        rect(100, 100, 100, 100);
    }
    public void mouseClicked(){
        stroke(1);                 // Initiated when mouse is pressed AND released (rect() created upon release)
        fill(255, 0, 255);        // If mouse is pressed and moved, then released, will not initiate
        rect(400, 400, 100, 100);
    }
    public void mouseDragged(){  // Initiated when mouse is held and moved
        stroke(1);
        fill(0, mouseX, mouseY, 63);
        rect(mouseX, mouseY, 200, 200);
    }
    public void mouseMoved(){
        noStroke();
        fill(70, mouseY, mouseX, 20);
        ellipse(mouseX, mouseY, 150, 150);
    }

    public void keyPressed(){
        background(255); // Clears the background
    }

    public void keyTyped() {  // Behaves same as keyPressed()
        stroke(1);
        fill(0, 0, 255);
        rect(0, 0, 200, 200);
    }
    public void keyReleased(){
        background(0);
    }



    public static void main(String args[]){
        PApplet.main(new String[]{"Assignments.active"});
    }
}