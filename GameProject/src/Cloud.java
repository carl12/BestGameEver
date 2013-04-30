import java.awt.Color;

import java.awt.Graphics;


public class Cloud {

    int x;

    int y;

    int height = 20;

    public Cloud(int x, int y){

        this.x = x;

        this.y = y;

    }

    public void create(Graphics g){

        g.setColor(Color.WHITE);

        g.drawOval(x + 10, y, height, height);

        g.drawOval(x - 10, y, height, height);

        g.drawOval(x, y + 10, height, height);

        g.drawOval(x, y - 10, height, height);

        g.drawOval(x + 10, y + 10, height, height);

        g.drawOval(x - 10, y - 10, height, height);

        g.drawOval(x - 10, y + 10, height, height);

        g.drawOval(x + 10, y - 10, height, height);

        g.fillOval(x + 10, y, height, height);

        g.fillOval(x - 10, y, height, height);

        g.fillOval(x, y + 10, height, height);

        g.fillOval(x, y - 10, height, height);

        g.fillOval(x + 10, y + 10, height, height);

        g.fillOval(x - 10, y - 10, height, height);

        g.fillOval(x - 10, y + 10, height, height);

        g.fillOval(x + 10, y - 10, height, height);

    }

}


