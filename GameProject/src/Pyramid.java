import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Pyramid {

    int x;

    int y;

    public Pyramid(int x, int y){

        this.x = x;

        this.y = y;

    }

    public void draw(Graphics g) {

       

        g.setColor(new Color(240,240,14));

        Polygon polygon1= new Polygon();

        for (int i = 0; i < 3; i++){

            polygon1.addPoint((int) (x + 50 * Math.sin(i * 2 * Math.PI / 3)),

                    (int) (y + -50 * Math.cos(i * 2 * Math.PI / 3)));

        }

        g.drawPolygon(polygon1);

        g.fillPolygon(polygon1);

    }

}

