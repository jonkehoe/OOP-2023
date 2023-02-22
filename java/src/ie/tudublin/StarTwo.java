package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;

public class StarTwo extends PApplet {

    int numStars = 0;

    // Declare a global ArrayList of Star objects.
    ArrayList<Star> stars = new ArrayList<Star>();

    // Write a method called printStars that prints the contents of the ArrayList
    // after it has been loaded. You should make a toString method on the Star class
    // to help you do this. Call this from setup after you load the data to make
    // sure it gets loaded correctly.
    public void printStars() {
        for (Star s : stars) {
            System.out.println(s.Hab + " " + s.DisplayName + " " + s.Distance + " " + s.xg + " " + s.yg + " " + s.zg
                    + " " + s.AbsMag);
        }
        // System.out.println(stars.size());

    }

    void loadStars() {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for (TableRow r : table.rows()) {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    // Create a class called Star to encapsulate the columns of interest from a
    // single row from the file. The columns of interest are given in the table
    // above. Feel free to add additional fields if you need them later.
    public Star(TableRow row)

    {
        this(
                row.getInt("Hab?") == 1,
                row.getString("Display Name"),
                row.getFloat("Distance"),
                row.getFloat("Xg"),
                row.getFloat("Yg"),
                row.getFloat("Zg"),
                row.getFloat("AbsMag"));
    }

    public Star(boolean Hab, String DisplayName, float Distance, float xg, float yg, float zg, float AbsMag) {
        this.Hab = Hab;
        this.DisplayName = DisplayName;
        this.Distance = Distance;
        this.xg = xg;
        this.yg = yg;
        this.zg = zg;
        this.AbsMag = AbsMag;
        numStars++;


        // System.out.println(Hab + " " + DisplayName + " " + Distance + " " + xg + " "
        // + yg + " " + zg + " " + AbsMag);
        // System.out.println(stars.size());

    }

    public Star() {
    }

    public boolean Hab;
    public String DisplayName;
    public float Distance;
    public float xg;
    public float yg;
    public float zg;
    public float AbsMag;

    // Write code to draw the purple gridlines with labels. You should leave a 50
    // pixel border around the outside of the drawing window. These gridlines go
    // from -5 parsecs to 5 parsecs on the x and y axis.
    public void drawGrid() {
        stroke(255);
        strokeWeight(1);
        line(-5, 0, 5, 0);
        line(0, -5, 0, 5);
        line(0, 0, -5, 0);
        line(0, 0, 0, -5);
        line(0, 0, 0, 5);
        line(0, 0, 0, 0);

        fill(255);
        textAlign(CENTER, CENTER);
        textSize(10);
        text("Hab", 0, 0);
        text("Display Name", 0, 10);
        text("Distance", 0, 20);
        text("x", 0, 30);
        text("y", 0, 40);
        text("z", 0, 50);
        text("AbsMag", 0, 60);

    }

    public void draw() {
        background(255);
        drawGrid();
        printStars();
        drawStars();
        strokeWeight(2);	

    }

    public void settings() {
        size(800, 800);
        smooth();

    }

    public void setup() {
        colorMode(HSB);
		background(0);
		
		smooth();
        loadStars();
        
      

    }

    // Write code to plot the stars onto the grid. For each star you should: Use the
    // star's Xg and Yg values. Ignore the Zg value when drawing the Star.Draw a
    // yellow cross at the star position on the grid. Draw a red circle with a
    // diameter of the star's size. Print the star name beside the star. The text
    // should be left aligned horizontally and centred vertically.
    public void drawStars() {
        for (Star s : stars) {
            float x = map(s.xg, -5, 5, 0, width);
            float y = map(s.yg, -5, 5, 0, height);
            float z = map(s.zg, -5, 5, 0, width);
            float r = map(s.AbsMag, 0, 10, 0, width);
            stroke(255);
            strokeWeight(1);
            line(x, y, x + r, y);
            circle(x, y, r);
            fill(255);
            textAlign(CENTER, CENTER);
            textSize(10);
            text(s.DisplayName, x, y);
        }

    }

    // Write code so that you can: Click inside a single star and draw a yellow line
    // to the mouse. You can add a mousePressed method to your sketch. This method
    // will get called when the mouse is pressed. Use mouseX and mouseY to determine
    // the mouse coordinates. When you click a second star, the yellow line should
    // join the two stars and you should print the text:
    public void mousePressed() {
        for (Star s : stars) {
            float x = map(mouseX, 0, width, 0, width);
            float y = map(mouseY, 0, height, 0, height);
            stroke(255);
            strokeWeight(1);
            line(x, y, x + s.Distance, y);
        }

    }

}
