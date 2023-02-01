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
		background(201, 54, 54);
		
	}


	
	public void draw()
	{	
		// stroke(255);
		
		
		// fill(246,255, 0);
		// circle(250, 250, 420);
		
		// fill(10,250,206);
		// triangle(00, 450, 500, 450, 250, 0);
		// circle(250,250, 100);
		// fill(255,255,255);
		// ellipse(243, 250, 150, 90);
		// fill(0,0,0);
		// circle(245,250, 70);


		// background(0);
		noStroke();
		fill(255, 0, 0);
		circle(mouseX, mouseY, 100);

		
		
		
		
	}
}
