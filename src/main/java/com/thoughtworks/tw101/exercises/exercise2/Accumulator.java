package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int numPressed;

    Accumulator(){
        numPressed = 0;
    }

    public void increment(){
        numPressed++;
    }

    public int total(){
        return numPressed;
    }
}
