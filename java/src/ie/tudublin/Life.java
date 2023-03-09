package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet{

    LifeBoard board;

    public void settings() {
        size(500,500);
    }


    public void setup() {
        colorMode(RGB);

        board = new LifeBoard(100,this);
        board.randomize();
    }

    public void draw() {
        board.render();
    }
    
}
