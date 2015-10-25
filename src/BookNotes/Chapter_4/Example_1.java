package BookNotes.Chapter_4;
/**
 * Created by Rick on 10/20/2015.
 */

import processing.core.PApplet;

public class Example_1 extends PApplet {
    int count = 0;
    char letter = 'a';
    double d = 132.32;
    boolean happy = false;
    float x = 4.0f;
    float y = x + 5.2f;
    float z = x*y +15.0f;
    // You can't initialize variables outside of variable declaration out here for some reason.
    public void setup(){
        // But you CAN do it in here.
        int b = 1;
        int a;
        a = b+1;

        println("a:" + a);
        println(count);
        println(letter);
        println(d);
        println(happy);
        println(x);
        println(y);
        println(z);
    }
    public static void main(String args[]) {
        PApplet.main(new String[]{"BookNotes.Chapter_4.Example_1"});
    }
}
/*
 A variable is a named pointer to a location in the computer's memory ("memory address) where data is stored.

 Since computers only process information one instruction at a time, a variable allows a programmer to save information
 from one point in the program and refer back to it at a later time

 Variables can hold primitive values or references to objects and arrays.
 */