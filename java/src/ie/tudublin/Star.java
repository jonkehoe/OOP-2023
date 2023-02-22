package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;

public class Star extends PApplet {

  ArrayList<Star> stars = new ArrayList<Star>();

  public void settings() {
    size(800, 800);
  }

  public void setup() {
    colorMode(RGB);
    background(0);

    loadStars();
    printStars();
  }

  public void draw() {
  }


  private boolean hab;
  private String displayName;
  private float xg;
  private float yg;
  private float zg;
  private float absMag;
  private float distance;

  public boolean isHab() {
    return hab;
  }

  public void setHab(boolean hab) {
    this.hab = hab;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public float getXg() {
    return xg;
  }

  public void setXg(float xg) {
    this.xg = xg;
  }

  public float getYg() {
    return yg;
  }

  public void setYg(float yg) {
    this.yg = yg;
  }

  public float getZg() {
    return zg;
  }

  public Star(boolean hab, String displayName, float xg, float yg, float zg, float absMag, float distance) {
    this.hab = hab;
    this.displayName = displayName;
    this.xg = xg;
    this.yg = yg;
    this.zg = zg;
    this.absMag = absMag;
    this.distance = distance;
  }

  public Star(TableRow row) {
    this(row.getBoolean("hab"),
        row.getString("displayName"),
        row.getFloat("xg"),
        row.getFloat("yg"),
        row.getFloat("zg"),
        row.getFloat("absMag"),
        row.getFloat("distance"));

  }

  public void render(PApplet p) {

    float border = p.width * 0.1f;
    float x = PApplet.map(xg, -5, 5, border, p.width - border);
    float y = PApplet.map(yg, -5, 5, border, p.height - border);

    p.stroke(255, 255, 0);
    p.line(x, y - 5, x, y + 5);
    p.line(x - 5, y, x + 5, y);
    p.stroke(255, 0, 0);

    p.fill(255);
    p.textAlign(PApplet.LEFT, PApplet.CENTER);
    p.text(displayName, x, y);

  
  }

  public void loadStar() {
    Table table = loadTable("HabHYG15ly.csv", "header");
    for (TableRow row : table.rows()) {
      new Star(row);

    }
  }

  public void printStars() {
    for (int i = 0; i < stars.size(); i++) {
      println(stars.get(i));
    }
  }

  public void displayStars() {
    for (int i = 0; i < stars.size(); i++) {
      stars.get(i).render(this);
    }
  }

}
