package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by harukogaki on 7/1/2017.
 */
public class NewGuessGame {

    ArrayList<Integer> guesses;
    private int randNum;

    public NewGuessGame(){
        Random rand = new Random();
        this.randNum = rand.nextInt(100);
        this.guesses = new ArrayList<>();
        //System.out.println("Random Number: " + this.randNum); //For Debugging purposes
    }
    /*
     * Return:
     * +0 -> Correct Guess
     * -1 -> Number is less than guess
     * +1 -> Number is greater than guess
     */
    public int guess(int aNum){

        //Add Guess
        guesses.add(aNum);

        //Determine if guessed correctly
        if (randNum == aNum){

            //Print out all previous guesses including the winning guess
            for (Integer aGuess : guesses){
                System.out.println(aGuess);
            }
            return 0;
        }
        else{
            return ((aNum < randNum) ? -1 : 1);
        }
    }

}
