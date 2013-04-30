  import java.awt.Color;

import java.awt.Graphics;

import java.util.Random;

import java.util.Scanner;

public class Character {

    private String name;

    private int attackStat;

    private int defenseStat;

    private int speedStat;

    private int evasivenessStat; // will implement random number generator for probability of hit

    private int permaHealthStat; // max health a character has

    private int healthStat;

    private int manaStat;

    private int manaBar;

    private int experienceStat;

    private int experienceBar;

    private int level;

    Attacks attackList[] = new Attacks[4];

    public Character(String name, Attacks attackOne){

        setName(name);

        setAttack(5);

        setDefense(3);

        permaHealthStat = 25;

        healthStat = permaHealthStat;

        setSpeed(new Random().nextInt(10));

        experienceStat = 0;

        level = 1;

        attackList[0] = attackOne;

        experienceBar = 10;

    }

    public String getName(){

        return name;

    }

    public String setName(String input){

        name = input;

        return name;

    }

    public int getAttack(){

        return attackStat;

    }

    public void setAttack(int input){

        attackStat = input;

    }

    public int getDefense(){

        return defenseStat;

    }

    public int setDefense(int input){

        defenseStat = input;

        return defenseStat;

    }

    public int getSpeed(){

        return speedStat;

    }

    public int setSpeed(int input){

        speedStat = input;

        return speedStat;

    }

    public int getEvasiveness(){

        return evasivenessStat;

    }

    public int setEvasiveness(int input){

        evasivenessStat = input;

        return evasivenessStat;

    }

    public int getHealth(){

        return healthStat;

    }

    public int setHealth(int input){

        healthStat = input;

        return healthStat;

    }

    public int getExperience(){

        return experienceStat;

    }

    public void setExperience(int input){

        experienceStat = input;

    }

    public int getLevel()

    {

        return level;

    }

    public void setLevel(int aLevel)

    {

        level = aLevel;

    }

    public int getExperienceBar()

    {

        return experienceBar;

    }

    public void setExperienceBar(int bar)

    {

        experienceBar = bar;

    }

    public void fullHeal()

    {

        healthStat = permaHealthStat;

    }

    public void addAttack(Attacks anAttack){ // automatically adds given move to lowest slot

        boolean added = false;

        boolean moveExisted = false;

        for(int i = 0; i < 4; i++){

            if(attackList[i] != null){

                if(attackList[i].getName().compareToIgnoreCase(anAttack.getName()) == 0 )

                {

                    moveExisted = true;

                }

            }

        }

        for(int i = 0; i < 4; i++)

        {

            if(attackList[i] == null

                    && !added

                    && !moveExisted)

            {

                attackList[i] = anAttack;

                added = true;

                System.out.println(i);

                System.out.println("Congratulations!! " +

                        name + " has learned " + anAttack.getName() + "!!!!");   

            }

        }

        if(!added && !moveExisted)

        {

            System.out.println("Could not learn " + anAttack.getName() + ". Moveset full");

            removeAttack(anAttack);

        }

        else if(moveExisted)

        {

            System.out.println(name + " already knows this move!");

        }

    }

    public void addAttack(Attacks anAttack, int slot){ //tries to add move to given slot, slot = user input

        if ((slot - 1) < 4){

            if (attackList[slot] == null){

                attackList[slot] = anAttack;

            }

            else{

                System.out.println("This slot has been taken, choose another");

                addAttack(anAttack, slot);

            }

        }

    }

   

    public void removeAttack(){

       

        System.out.println("Which move would you like to remove?");

        for(int i = 0; i < 4; i++){

            if(attackList[i] != null){

                System.out.println(attackList[i].getName());

            }

        }

       

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();   

       

        for(int i = 0; i < 4; i++){

            if(attackList[i].getName().compareToIgnoreCase(input) == 0){

                attackList[i] = null;

                i = 5;

            } else{

                System.out.println("That move does not exist! Would you still like to delete a move? (type yes or no)");

                Scanner scan2 = new Scanner(System.in);

                String input2 = scan2.nextLine().toLowerCase();

               

                boolean isValid = true;

               

                while(isValid == true){

                    if(input2.compareToIgnoreCase("yes") == 0){

                        removeAttack();

                        isValid = false;

                        i = 5;

                    }

                    else if(input2.compareToIgnoreCase("no") == 0){

                        isValid = false;

                        i = 5;

                    } else{

                        isValid = true;

                        i = 5;

                    }

                }   

            }

        }

    }

   

    public void removeAttack(Attacks replaceAttack){

       

        System.out.println("Which move would you like to remove?");

        for(int i = 0; i < 4; i++){

            if(attackList[i] != null){

                System.out.println(attackList[i].getName());

            }

        }

       

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();   

       

        for(int i = 0; i < 4; i++){

            if(attackList[i].getName().compareToIgnoreCase(input) == 0){

                attackList[i] = replaceAttack;

                i = 5;

            } else{

                System.out.println("That move does not exist! Would you still like to delete a move? (type yes or no)");

                Scanner scan2 = new Scanner(System.in);

                String input2 = scan2.nextLine().toLowerCase();

               

                boolean isValid = true;

               

                while(isValid == true){

                    if(input2.compareToIgnoreCase("yes") == 0){

                        removeAttack();

                        isValid = false;

                        i = 5;

                    }

                    else if(input2.compareToIgnoreCase("no") == 0){

                        isValid = false;

                        i = 5;

                    } else{

                        isValid = true;

                        i = 5;

                    }

                }   

            }

        }

    }

   

    public String levelUp()

    {

        attackStat = attackStat + 3;

        defenseStat = defenseStat + 3;

        speedStat = speedStat + 3;

        permaHealthStat = permaHealthStat + 3;

        evasivenessStat = evasivenessStat + 3;

        experienceStat = 0;

        experienceBar = experienceBar + 5;

        level = level + 1;

        String congratulations = "Congratulations: " + name +

                " just leveled up to level " + level + "!!";

       

        //These should theoretically use the switch notation to make adding a move more efficient

        //Also when we start creating actual characters (subclasses of character), these should be in there instead of here

        if(level == 2)

        {

            this.addAttack(new Attacks(6, .5 , "Seismic Toss"));

        }

        if(level == 3)

        {

            this.addAttack(new Attacks(8, 0, "Slash"));

        }

        if(level == 4)

        {

            this.addAttack(new Attacks(20, 1 , "HYPER BEAM"));

        }

        if(level == 5)

        {

            this.addAttack(new Attacks(9001, -.0002 , "KAMEHAMEHA"));

        }

        return congratulations;

    }

    public void create(Graphics g, int x, int y, Color color)

    {

        g.drawOval(x, y, 100, 100);

        g.setColor(color);

        g.fillOval(x, y, 100, 100);

        g.setColor(Color.black);

        g.drawString(name, x + 30, y + 50);

        g.drawString("Health: " + healthStat, x, y - 100);

    }

}

    /*

    public void attackOther(Character other){

        System.out.println("What will " + name + " do?");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        boolean didAttack = false;

        for(int i = 0; i < 4; i++)

        {

            if(attackList[i] != null){

                if(attackList[i].getName().compareToIgnoreCase(input) == 0)

                {

                    System.out.println("doing damage");

                    didAttack = true;

                    attackList[i].doDamage(this, other);

                }

            }

        }

        if(!didAttack){

            System.out.println(name + " doesn't know that move! AAAAAGH, try again.");

            attackOther(other);

        }

    }

    public void attackOther(Character other, String input){

        System.out.println("What will " + name + " do?");

        boolean didAttack = false;

        for(int i = 0; i < 4; i++)

        {

            if(attackList[i] != null){

                if(attackList[i].getName().compareToIgnoreCase(input) == 0)

                {

                    System.out.println("doing damage");

                    didAttack = true;

                    attackList[i].doDamage(this, other);

                }

            }

        }

        if(!didAttack){

            System.out.println(name + " doesn't know that move! AAAAAGH, try again.");

            //attackOther(other, input);

        }

    }

    */


   












