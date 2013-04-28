import java.util.Random;


public class Attacks {

    private int strength;

    private String name;

    private double lifesteal;
    public Attacks(int theStrength, double theLifesteal, String name){

        strength = theStrength;
        lifesteal = theLifesteal;
        this.name = name;

    }

    public int getStrength(){

        return strength;

    }
    public double getLifesteal()
    {
    	return lifesteal;
    }

    public int setStrength(int theStrength){

        strength = theStrength;

        return strength;

    }

    public String getName(){

        return name;

    }

    public boolean doDamage(Character user, Character other)

    {

        boolean crit = false;

        int criticalHit = 0;

        if(new Random().nextInt(5) > 3)

        {

            criticalHit = user.getAttack();

            crit = true;

        }

        int damage = (user.getAttack() * strength + criticalHit) / other.getDefense();

        System.out.println("Damage done: " + damage);

        other.setHealth(other.getHealth() - damage);
        user.setHealth(user.getHealth() + (int)(damage * lifesteal));
        return crit;

    }   

}







