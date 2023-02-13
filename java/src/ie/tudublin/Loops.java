package ie.tudublin;

import processing.core.PApplet;


public class Loops extends PApplet {

	int mode = 0;
	int i;
	int j;

	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	public void draw() {
		background(0);
		// fill(255);
		// noStroke();
		colorMode(HSB, 400);
		noStroke();

		// for(i=0;i<10;i++) {
		// for(j=0;j<10;j++) {

		// float hue = map(i, 0, 9, 0, 360);
		// float saturation = map(j, 0, 9, 0, 100);
		// float brightness = 100;
		// fill(hue, saturation, brightness);
		// noStroke();
		// ellipse(i * 100 + 50, j * 100 + 50, 100, 100);
		// }
		// }

		switch (mode) {

			case 0:

				int numCircle = 12; 
				float d = width / numCircle;
				for (j = 0; j < numCircle; j++) {
					for (i = 0; i < numCircle; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / (numCircle * 2.0f)) * 255.0f;
						fill(c, 255, 255);
						circle(x, y, d);
					}
				}
				break;
		}

	}
}