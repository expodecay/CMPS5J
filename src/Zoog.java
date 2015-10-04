/**
 * Created by Rick on 9/27/2015.
 *
 */
import processing.core.PApplet;
import processing.core.PVector;

public class Zoog extends PApplet {
    int pts = 40;
    float angle = 0;
    float  radius = 60;

    // lathe segments
    int segments = 60;
    float latheAngle = 0;
    float latheRadius = 100;

    //vertices
    PVector vertices[], vertices2[];

    // for shaded or wireframe rendering
    boolean isWireFrame = false;

    // for optional helix
    boolean isHelix = false;
    float  helixOffset = 5;

    public void setup(){
        size(1000, 700, P3D);
    }

    public void draw(){
        background(0, 0, 0);
        // basic lighting setup
        lights();
        // 2 rendering styles
        // wireframe or solid
        if (isWireFrame){
            stroke(20, 255, 30);
            noFill();
        }
        else {
            noStroke();
            fill(150, 195, 125);
        }
        //center and spin toroid
        translate(width/2, height/2, -100);

        rotateX(frameCount*PI/150);
        rotateY(frameCount*PI/170);
        rotateZ(frameCount*PI/90);

        // initialize point arrays
        vertices = new PVector[pts+1];
        vertices2 = new PVector[pts+1];

        // fill arrays
        for(int i=0; i<=pts; i++){
            vertices[i] = new PVector();
            vertices2[i] = new PVector();
            vertices[i].x = latheRadius + sin(radians(angle))*radius;
            if (isHelix){
                vertices[i].z = cos(radians(angle))*radius-(helixOffset*
                        segments)/2;
            }
            else{
                vertices[i].z = cos(radians(angle))*radius;
            }
            angle+=360.0/pts;
        }

        // draw toroid
        latheAngle = 0;
        for(int i=0; i<=segments; i++){
            beginShape(QUAD_STRIP);
            for(int j=0; j<=pts; j++){
                if (i>0){
                    vertex(vertices2[j].x, vertices2[j].y, vertices2[j].z);
                }
                vertices2[j].x = cos(radians(latheAngle))*vertices[j].x;
                vertices2[j].y = sin(radians(latheAngle))*vertices[j].x;
                vertices2[j].z = vertices[j].z;
                // optional helix offset
                if (isHelix){
                    vertices[j].z+=helixOffset;
                }
                vertex(vertices2[j].x, vertices2[j].y, vertices2[j].z);
            }
            // create extra rotation for helix
            if (isHelix){
                latheAngle+=720/segments;
            }
            else {
                latheAngle+=360/segments;
            }
            endShape();
        }
    }

    /*
     left/right arrow keys control ellipse detail
     up/down arrow keys control segment detail.
     'a','s' keys control lathe radius
     'z','x' keys control ellipse radius
     'w' key toggles between wireframe and solid
     'h' key toggles between toroid and helix
     */
    public void keyPressed(){
        if(key == CODED) {
            // pts
            if (keyCode == UP) {
                if (pts<40){
                    pts++;
                }
            }
            else if (keyCode == DOWN) {
                if (pts>3){
                    pts--;
                }
            }
            // extrusion length
            if (keyCode == LEFT) {
                if (segments>3){
                    segments--;
                }
            }
            else if (keyCode == RIGHT) {
                if (segments<80){
                    segments++;
                }
            }
        }
        // lathe radius
        if (key =='a'){
            if (latheRadius>0){
                latheRadius--;
            }
        }
        else if (key == 's'){
            latheRadius++;
        }
        // ellipse radius
        if (key =='z'){
            if (radius>10){
                radius--;
            }
        }
        else if (key == 'x'){
            radius++;
        }
        // wireframe
        if (key =='w'){
            if (isWireFrame){
                isWireFrame=false;
            }
            else {
                isWireFrame=true;
            }
        }
        // helix
        if (key =='h'){
            if (isHelix){
                isHelix=false;
            }
            else {
                isHelix=true;
            }
        }
    }
    public static void main(String args[]) {
        PApplet.main(new String[]{"Zoog"});
    }
}

