package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by harukogaki on 7/1/2017.
 */
public class GuessGame {

    private int randNum;

    public GuessGame(){
        Random rand = new Random();
        this.randNum = rand.nextInt(100);
        //System.out.println("Random Number: " + this.randNum); //For Debugging purposes
    }
    /*
     * Return:
     * +0 -> Correct Guess
     * -1 -> Number is less than guess
     * +1 -> Number is greater than guess
     */
    public int guess(int aNum){
        if (randNum == aNum){
            return 0;
        }
        else{
            return ((aNum < randNum) ? -1 : 1);
        }
    }

}
