package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.GuessGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewGuessGame game = new NewGuessGame();
        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        do{
            System.out.print("Take a Guess: ");

            //Handle NumberFormatException when retrieving a guess
            int num;
            try{
                num = Integer.parseInt(scanner.next());

            }catch (NumberFormatException ex){
                System.out.println("Invalid Input... Try Again.\n");
                continue;
            }


            int result = game.guess(num);
            switch (result){
                case 0:
                    System.out.println("Guessed Correctly!");
                    done = true;
                    break;
                case -1:
                    System.out.println("Guessed Below");
                    break;
                case 1:
                    System.out.println("Guessed Above");
            }

            System.out.println();
        }while (!done);
    }
}
