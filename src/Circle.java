// Circle.java
// A simple class that relies on a PApplet instance to use Processing functions.
// See http://processing.org/tutorials/eclipse/ for an explanation.
// Yong Bakos

import processing.core.*;

public class Circle extends Drawable {

    private PApplet p;
    public int radius;
    private int strokeColor;
    private int fillColor;
    
    public Circle(PApplet p, int x, int y, int radius, int strokeColor, int fillColor) {
        this.p = p;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
    }
    
    public void draw() {
        p.pushStyle();
        p.stroke(strokeColor);
        p.fill(fillColor);
        p.ellipse(x, y, radius, radius);
        p.popStyle();
    }
    
}