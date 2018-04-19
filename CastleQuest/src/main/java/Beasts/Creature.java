package Beasts;

import Behaviours.ITargetable;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Creature implements ITargetable{
    private String name;
    private int healthPoints;
    private int damagePoints;

    public Creature (String name, int healthPoints, int damagePoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String beHealed(int health) {
        this.healthPoints += health;
        return "Rawr thanks!";
    }

    public String takeDamage(int damage){
        healthPoints -= damage;
        return "Rawr Ouch!";
    }

    private Boolean attackHasHit(){
        int randomNum1To11 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        return randomNum1To11 < 5;
    }

    public void attack(ITargetable target){
        if (attackHasHit()){
            target.takeDamage(damagePoints);
        }
    }

}
