// Sketch.java
// A simple PApplet class stub.
// Yong Bakos

import processing.core.*;

public class Sketch extends PApplet {

    private Circle circle;
    
    public void setup() {
        size(400, 400);
        background(0);
        circle = new Circle(this, width / 2, height / 2, 100);
    }

    public void draw() {
        background(0);
        stroke(255);
        if (mousePressed) {
            line(mouseX, mouseY, pmouseX, pmouseY);
            circle.draw();
        }
    }

}