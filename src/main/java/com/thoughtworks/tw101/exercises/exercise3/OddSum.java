package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        //If the bounds don't make sense
        if (end < start){
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++){

            //if odd
            if (i % 2 == 1){
                sum += i;
            }
        }

        return sum;
    }
}
