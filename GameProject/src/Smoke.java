import java.awt.*;

import java.util.LinkedList;

import java.util.Random;


public class Smoke {

    final int NUMBER_OF_SMOKE = 20;

    int x;

    int y;

    int initialSize = 20;

    Circle[] list = new Circle[NUMBER_OF_SMOKE];

    Circle circle;

    public Smoke(int startingX, int startingY){

       

        x = startingX;

        y = startingY;

        int numberOfSmoke = NUMBER_OF_SMOKE;

        int i = 1;

        int index = 0;

        for(int counter = 0; counter < NUMBER_OF_SMOKE; counter++){

        circle = new Circle(x, y - i, initialSize + index);

        i = (i + 50);

        index = index + 10;

        numberOfSmoke--;

        list[counter] = circle;

        }

    }

       

   

    public void draw(Graphics g){

        Circle[] newList = new Circle[NUMBER_OF_SMOKE];

        for(int i = 0; i < NUMBER_OF_SMOKE; i++){

        Circle currentCircle = list[i];

        g.drawOval(currentCircle.x, currentCircle.y, currentCircle.size, currentCircle.size);

        g.setColor(Color.gray);

        g.fillOval(currentCircle.x, currentCircle.y, currentCircle.size, currentCircle.size);

        newList[i] = currentCircle;

        }

        list = newList;

    }

    private void rise(Circle circle){

        Random random = new Random();

        circle = new Circle(x, y - random.nextInt(10) + 40, initialSize + random.nextInt(5) + 5);

    }

    public void run(){

        Circle[] newList = new Circle[NUMBER_OF_SMOKE];

        for(int i = 0; i < NUMBER_OF_SMOKE; i++){

        Circle currentCircle = list[i];

        rise(currentCircle);

        newList[i] = currentCircle;

        }

        for(int i = 0; i < NUMBER_OF_SMOKE; i++){

        list[i] = newList[i];

        }

    }

}


