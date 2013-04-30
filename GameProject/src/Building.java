import java.awt.Color;

import java.awt.Graphics;


public class Building {

    int x;

    int y;

    int width;

    int height;

    final int WINDOW_SIZE = 20;

    public Building(int anX, int anY, int aWidth, int aHeight){

        x = anX;

        y = anY;

        width = aWidth;

        height = aHeight;

    }

    public void draw(Graphics g){

        int windowGap = 20;

        int intervals = 0;

        g.setColor(Color.black);

        g.fillRect(x, y, width, height);

        g.setColor(Color.YELLOW);

        while(windowGap < height){

        g.fillRect(x + width/8,y + windowGap , WINDOW_SIZE , WINDOW_SIZE);

        g.fillRect(x + width/2 + width/8,y + windowGap, WINDOW_SIZE , WINDOW_SIZE);

        intervals++;

        windowGap = windowGap + 20;

        if(intervals % 2 == 0){

            g.setColor(Color.YELLOW);

        }

        if(intervals % 2 != 0){

            g.setColor(Color.black);

        }

       

        }

    }

}


