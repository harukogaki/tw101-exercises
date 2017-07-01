package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        do{
            System.out.print("Take a Guess: ");
            int num = Integer.parseInt(scanner.next());
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
