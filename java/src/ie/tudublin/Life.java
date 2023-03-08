package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

	LifeBoard board;
	private boolean running;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		board = new LifeBoard(50, this);
		board.randomise();
		size(800, 600);
	}

	public void draw() {
		background(0);
		board.render();
		board.applyRules();

		if (running) {
			board.applyRules();
		}
		board.render();
	}

	public void keyPressed() {
		if (key == ' ') {
			running = !running;
		}

		// randomise the board using the 1 key pressed and clear the board using the 2
		// key pressed

		if (key == '1') {
			board.randomise();
		} else if (key == '2') {
			board.clear();
		} else if (key == ' ') {
			running = !running;
		}





	}
}
