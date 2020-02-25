///////////////////////////////////////// 100 COLUMNS WIDE /////////////////////////////////////////

import processing.core.PApplet;

/**
 * This class is the driver application for Minesweeper.
 * 
 * @author laogao216
 */
public class Driver extends PApplet {

  // TODO - prompt user for the following three fields
  public static int row = 50;
  public static int col = 50;
  public static int mineCount = 500;

  private Minesweeper pen;
  private int rowDisp = 0;
  private int colDisp = 51;
  // move the game board down or to the right. Unit is pixel.

  /**
   * runs PApplet
   */
  public static void main(String[] args) {
    PApplet.main("Driver");
  }

  /**
   * set up window dimension
   * 
   * @see https://processing.org/reference/settings_.html
   */
  @Override
  public void settings() {
    size(row * 16 + 1 + rowDisp, col * 16 + 1 + colDisp);
  }

  /**
   * calling Minesweeper constructor with PApplet processing
   * 
   * @see https://processing.org/reference/setup_.html
   */
  @Override
  public void setup() {
    pen = new Minesweeper(this, rowDisp, colDisp);
  }

  /**
   * send user actions to Minesweeper class
   * 
   * @see https://processing.org/reference/draw_.html
   */
  @Override
  public void draw() {
    pen.update(mouseX, mouseY, mousePressed, mouseButton);
  }

}
