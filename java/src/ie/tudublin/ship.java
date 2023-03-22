package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class ship {
    private PVector pos;
    PApplet p;

    


    public ship(float x, float y, float size, int c, PApplet p, PVector forward)
    {
        pos = new PVector(x, y);
        forward = new PVector(size, c);
        this.size = size;
        this.halfSize = size /2;
        this.c = c;
        this. p = p;
    }

    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    private float rot;
    private int c;
    private float size;
    private float halfSize;

    public void move()
    {
        forward.x = PApplet.sin(rot);
        forward.y = PApplet.sin(rot);

        if (p.keyPressed) {
            if (p.keyCode == PApplet.LEFT)
            {
                pos.x --;
            }
            if (p.keyCode == PApplet.RIGHT)
            {
                pos.x --;
            }
            if (p.keyCode == PApplet.UP)
            {
                pos.x += forward.x;
                pos.y += forward.y;
            }
            if (p.keyCode == PApplet.DOWN)
            {
                pos.x -= forward.x;
                pos.y -= forward.y;
            }
        
        }

        
    }

    public void render() {
        
        p.pushMatrix();
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.stroke(c, 255, 255);
        p.line( - halfSize, halfSize, 0, - halfSize);
        p.line(0, - halfSize, halfSize, + halfSize);
        p.line(halfSize, halfSize, 0, 0);
        p.line(0, 0, -halfSize, halfSize);
        p.popMatrix();

    }
    
}
