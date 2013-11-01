// Circle.java
// A simple class that relies on a PApplet instance to use Processing functions.
// Yong Bakos

import processing.core.*;

public class Circle extends Drawable {

    private PApplet p;
    public int radius;
    
    public Circle(PApplet p, int x, int y, int radius) {
        this.p = p;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public void draw() {
        p.ellipse(x, y, radius, radius);
    }
    
}