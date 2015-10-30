package Assignments;
/**
 * Created by Rick on 10/29/2015.
 */

import processing.core.PApplet;

public class MouseInBox extends PApplet {

    int x, y, i, j, rows, columns, r=1, len=20;

    public void setup(){
        size(500, 500);
        rectMode(CORNER);
        rows = width/len; // 25 rows (adjusts to whatever size the window is set to)
        columns = height/len; // 25 columns
        for (i=0; i < rows; i++){ // Column loop
            for (j = 0; j < columns; j++){ // Row loop
                rect(i * len,j * len, len, len);
            }
        }
    }
    public void draw(){
    }
    public void mousePressed(){
        fill(0);
        for (i = 0; i < 3; i++){ // Up to but not including 3 (can also use i <= 2)
            for (j = 0; j < 2; j++){
                fill(0);
                rect((mouseX/len)*len + len * r*j, (mouseY/len)*len + len * r*j, len, len);
                rect((mouseX/len)*len - len * r*j, (mouseY/len)*len + len * r*j, len, len);
            }
            r*=-1; // Alternates the sign of each rect() argument.
        }
    }
    public void mouseDragged(){
        fill(0);
        for (i = 0; i < 3; i++){
            for (j = 0; j < 2; j++){
                fill(0);
                rect((mouseX/len)*len + len * r*j, (mouseY/len)*len + len * r*j, len, len);
                rect((mouseX/len)*len - len * r*j, (mouseY/len)*len + len * r*j, len, len);
            }
            r*=-1;
        }
    }
    public void keyPressed(){
        fill(255);
        for( i=0; i < rows; i++){
            for (j=0; j < columns; j++){
                rect(i*len,j*len,len,len);
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.MouseInBox"});
    }
}