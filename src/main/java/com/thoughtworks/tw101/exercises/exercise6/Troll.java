package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by harukogaki on 7/1/2017.
 */
public class Troll extends Creature implements Monster {
    public Troll() {
        super("Troll",40, 0.50); //Trolls take half damage
        //System.out.println("New Troll: 40HP");
    }

    @Override
    public void takeDamage(int amount) {
        //System.out.println("Troll takes damage: " + "-" + (amount*damageMult));
        hitpoints -= (amount * damageMult);
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hitpoints + "HP");
    }
}
