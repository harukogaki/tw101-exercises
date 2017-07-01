package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by harukogaki on 7/1/2017.
 */
public class Orc extends Creature implements Monster{

    public Orc (){
        super("Orc", 20, 1); //Orcs take normal damage
        //System.out.println("New Orc: 20HP");
    }

    @Override
    public void takeDamage(int amount) {
        //System.out.println("Orc takes damage: " + "-" + (amount*damageMult));
        hitpoints -= (amount * damageMult);
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hitpoints + "HP");
    }
}
