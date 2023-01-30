package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		// colorMode(HSB);
		background(0);
		
	}


	
	public void draw()
	{	
		stroke(255);
		line(10, 10, 100, 100); // x1 y2 y3
		circle(300, 250, 70);
		fill(255,0,0);
		rect(10, 300, 20, 100); // top leftx, 
		stroke(34);
		fill(0,255,0);
		triangle(40, 900, 90, 300, 50, 23); // x1, y1, x2, y2, x3, y3
		
		
		
	}
}
