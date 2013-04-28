import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;

import java.io.*;

import java.util.ArrayList;

/**

* This Class describes a bunch of Stars

* @author Andrew Tang

*/

public class Stars{

  public static final long serialVersionUID = 1;

  private ArrayList <Point> points;

  Point aPoint;

  

  int NUMBER_OF_POINTS = 0;

  final int HEIGHT = 5;

  final int INITIAL_PANEL_WIDTH = 300;

  final int INITIAL_PANEL_HEIGHT = 200;

  /**

   * Constructs a cloud

   */

  public Stars(){

     points = new ArrayList <Point> ();

  }

  /**

   * Adds a point to the cloud

   * @param point a point

   */

  public void add(Point point){

     points.add(point);

     NUMBER_OF_POINTS = NUMBER_OF_POINTS + 1;

  }

  /**

   * Draws the points to a panel

   * @param g graphics

   * @param width width of panel

   * @param height height of panel

   */

  public void draw(Graphics g, int width, int height){

     for(int i = 0; i < NUMBER_OF_POINTS; i++){

        aPoint = points.get(i);

        g.drawOval((int)aPoint.getX() * width/INITIAL_PANEL_WIDTH,(int)aPoint.getY() * height/INITIAL_PANEL_HEIGHT, HEIGHT , HEIGHT);

        g.setColor(Color.YELLOW);

        g.fillOval((int)aPoint.getX() * width/INITIAL_PANEL_WIDTH, (int)aPoint.getY() * height/INITIAL_PANEL_HEIGHT, HEIGHT, HEIGHT);

     }

  }

}


