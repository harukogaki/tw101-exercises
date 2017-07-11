package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        int num = 30;
        List<Integer> primeFactors = generate(num);

        //For Debugging Purposes
        System.out.println("Number: " + num);
        System.out.println("Prime Factors: ");
        for (Integer i : primeFactors){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        //For all numbers, not including 1 and n
        for(int i = 2; i < n; i++){

            //If n is divisible by this number
            if (n % i == 0) {

                //but not a multiple of an already existing number
                boolean notMultiple = true;

                for (Integer integer : primeFactors){
                    if (i % integer == 0) {
                        notMultiple = false;
                        break;
                    }
                }
                //add as a prime factor
                if (notMultiple)
                    primeFactors.add(i);
            }
        }

        return  primeFactors;
    }
}
