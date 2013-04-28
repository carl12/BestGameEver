import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;

import java.util.Random;

import javax.swing.JPanel;


public class Environments {

    int level;

    Pyramid pyramid1;

    Pyramid pyramid2;

    Building building1;

    Building building2;

    Building building3;

    Cloud cloud1;

    Cloud cloud2;

    Cloud cloud3;

    Smoke smoke;

    Stars stars;

    Random number = new Random();

    final int NUMBER_OF_STARS = 60;

    public Environments(int aLevel){

        level = aLevel;

        smoke = new Smoke(150, 375);

        cloud1 = new Cloud(100, 50);

        cloud2 = new Cloud(200, 100);

        cloud3 = new Cloud(300, 50);

        building1 = new Building(75, 150, 75, 10000);

        building2 = new Building(200, 100, 90, 10000);

        building3 = new Building(350, 125, 100, 10000);

        pyramid1= new Pyramid(150, 375);

        pyramid2 = new Pyramid(350, 375);

        stars = new Stars();

         for(int i = 0; i < NUMBER_OF_STARS; i++){

             stars.add(new Point(number.nextInt(100), number.nextInt(200)));

         }

    }

    public void paint(Graphics g){

        switch(level){

        case 1:

            g.setColor(Color.CYAN);

            g.fillRect(-100, -100, 1000, 10000);

           

           

            cloud1.create(g);

            cloud2.create(g);

            cloud3.create(g);

            g.setColor(Color.YELLOW);

            g.fillOval(-80, -80, 150, 150);

            g.setColor(Color.GREEN);

            g.drawRect(0, 400, 1000, 1000);

            g.fillRect(0, 400, 1000, 1000);

            break;

        case 2:

            g.setColor(new Color(100, 200, 250));

            g.fillRect(-100, -100, 1000, 10000);

           

            g.setColor(new Color(217,219,28));

            g.drawRect(0, 400, 1000, 1000);

            g.fillRect(0, 400, 1000, 1000);

           

            g.setColor(new Color(221,172,86));

            g.fillOval(-80, -80, 150, 150);

            pyramid1.draw(g);

            pyramid2.draw(g);

            smoke.draw(g);

           

           

            break;

        case 3:

            g.setColor(new Color(15,24,137));

            g.fillRect(-100, -100, 1000, 10000);

           

            stars.draw(g, 2000, 200);

            building1.draw(g);

            building2.draw(g);

            building3.draw(g);

            g.setColor(new Color(100,24,100));

            g.drawRect(0, 400, 1000, 1000);

            g.fillRect(0, 400, 1000, 1000);

            g.setColor(Color.WHITE);

            g.fillOval(-80, -80, 150, 150);

           

            break;

        }

    }

}


