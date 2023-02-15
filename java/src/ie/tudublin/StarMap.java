package ie.tudublin;

import processing.core.PApplet;

public class StarMap extends PApplet
{
	int gridSize = 50;
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		size(500, 500);
		background(255);
		stroke(0);
		fill(0);
		textSize(12);
		textAlign(CENTER, CENTER);
		
		

		drawGrid();
		
	}

	public void drawGrid(){
		
		// draw a grid in green

		stroke(0, 0, 255);
		strokeWeight(2);
		for (int i = 0; i < width; i += gridSize) {
		  text(i / gridSize, i, -10);
		  for (int j = 0; j < height; j += gridSize) {
			line(i, j, i + gridSize, j);
			line(i, j, i, j + gridSize);
			text(j / gridSize, -20, j);
		  }
		}

		// draw a grind using processing cofe
		

	}
	
	

		
	public void draw()
	{	
		strokeWeight(2);		
	}
}
