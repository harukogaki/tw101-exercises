package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int start = 1;
        int end = 100;

        for(int i = start; i <= end; i++){

            //if odd
            if( i % 2 == 1){

                // Determine when a change in output should occur
                // For display purposes only
                if ( (i + 1) == end)
                    System.out.print(i + " = ");
                else
                    System.out.print(i + " + ");

                sum += i;
            }
        }

        System.out.println(sum);

    }
}
