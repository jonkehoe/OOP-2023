package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX = 0.0f;
	float playerY = 0.0f;
	float playerWidth = 50.0f;
	float h;
	float bugX = 0.0f;
	float bugY = 0.0f;
	float bugWidth = 20.0f;
	int score = 0;
	float halfBug;
	float halfPlayer;


	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();
		resetBug();

		// playerX = width * 0.5f;
		// playerY = height - 100;
		
		// bugX = width/2;
		// bugY = bugWidth;
		
	}


	float c = 0;
	
	public void draw()
	{	
		// strokeWeight(2);
		background(0);
		stroke(43, 232, 106);
		drawPlayer(playerX, playerY, playerWidth);

		drawBug(bugX, bugY, bugWidth);

		if ((frameCount % 60) == 0) {
			bugX += random(-10.0f, 10.0f);
		}
		


	}

	void resetBug()
	{
		bugY = 50;
		bugWidth = 50;
		halfBug = bugWidth * 0.5f;
		bugX = random(halfBug, width - halfBug);


    }
	

	public void drawPlayer(float x, float y, float w) {

		rectMode(CENTER);
		rect(w, x, y, w);
		// h = w * 0.5f;
		noFill();
		stroke(255, 0, 0);
		line(x, y - halfPlayer, x, y - halfPlayer * 2);
		

	}

	public void drawBug(float x, float y, float w) {

		// float h = w * 0.5f;
		stroke(0, 255, 0);
		line(x, y - halfBug, x, y - halfBug * 2);
		

	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			// System.out.println("Left arrow pressed");
			playerX --;
			if(playerX < 0){
				playerX = 0;
				// System.out.println("Gone out of bounds");
			}
		}
		if (keyCode == RIGHT)
		{
			// System.out.println("Right arrow pressed");
			playerX ++;
			if(playerX > width) {
				playerX = width;
			}
		}
		if (key == ' ')
		{
			// System.out.println("SPACE key pressed");
			stroke(255, 255, 0);
			line(playerX, playerY - halfPlayer, playerX, 0);
		}
	}
}
