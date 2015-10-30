package Assignments;
/**
 * Created by Rick on 10/29/2015.
 */

import processing.core.PApplet;

public class MouseInBox extends PApplet {

    int x, y, i, j, n, m;

    int len = 20;


    public void setup(){
        size(700, 700);
        rectMode(CORNER);
        len = 20;
        n = width/len;
        m = height/len;
        background(255);


        for(i=0; i<n; i++){ // Column loop
            for(j = 0; j < m; j++){ // Row loop
                rect(i * len,j * len, len, len);
            }
        }
    }
    public void draw(){
    }
    public void mousePressed(){
        noStroke();
        fill(0, 255, 255);
        for (i = 0; i < 2; i++){
            for (j = 0; j< 2; j++)
                /*
                for (int k = 0; k < 2; k++){
                    fill(0, 255, 255);
                    rect((mouseX/len)*len + len * i, (mouseY/len)*len + len * i, len, len);
                }*/

                rect((mouseX/20)*20, (mouseY/20)*20, 20, 20);
                rect((mouseX/20)*20-20, (mouseY/20)*20-20, 20, 20);
                rect((mouseX/20)*20-20, (mouseY/20)*20+20, 20, 20);
                rect((mouseX/20)*20+20, (mouseY/20)*20+20, 20, 20);
                rect((mouseX/20)*20+20, (mouseY/20)*20-20, 20, 20);
        }
    }
    public void mouseDragged(){
        noStroke();
        fill(0);
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++)
                rect((mouseX / 20) * 20, (mouseY / 20) * 20, 20, 20);
                rect((mouseX / 20) * 20 - 20, (mouseY / 20) * 20 - 20, 20, 20);
                rect((mouseX / 20) * 20 - 20, (mouseY / 20) * 20 + 20, 20, 20);
                rect((mouseX / 20) * 20 + 20, (mouseY / 20) * 20 + 20, 20, 20);
                rect((mouseX / 20) * 20 + 20, (mouseY / 20) * 20 - 20, 20, 20);
        }
    }
    public void keyPressed(){
        fill(255);
        for(i=0; i<n; i++){ // Column loop
            for(j=0; j<m; j++){ // Row loop
                rect(i*20,j*20,20,20);
            }
        }
    }

    public static void main(String args[]) {
        PApplet.main(new String[]{"Assignments.MouseInBox"});
    }
}