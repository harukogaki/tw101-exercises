package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by harukogaki on 7/1/2017.
 */

//Abstract class that both Orc and Troll classes extend from
// Given that both are creatures that Consist of HP and take damage
// at a particular rate
public abstract class Creature {
    public Creature (String name, int hp, double dMult){
        this.name = name;
        this.damageMult = dMult;
        this.hitpoints = hp;
    }

    protected String name;
    protected int hitpoints;
    protected double damageMult;
}
