package ie.tudublin;

public class practice1 {

    //draw a line between 100, 50 to 600, 250
    line(100,50, 600, 250);

    

    //the stoke is the out line of the rectangle
    stroke(100, 255 ,255);
    // the fill is the interior of the rectangle
    fill(100, 255, 0);

    rect(100, 50, 20, 200);

    // done once 
    public void setup() {
        size(800, 800);
    }

    // forever draw
    public void draw() {
    }
    
}
