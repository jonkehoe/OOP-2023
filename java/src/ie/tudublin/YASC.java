package ie.tudublin;

import processing.core.PApplet;
import ie.tudublin.ship;

public class YASC extends PApplet
{
	ship ship, ship1;



	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		ship = new ship(width/ 2, height /2, 50, 70, this);
		ship1 = new ship(100, 50, 80, 6, this);
		colorMode(HSB);
	}

	
	
	public void draw()
	{	
		background(0);
		ship.render();
		ship.move();
		ship1.render();
		ship1.move();
	}
}
