package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        System.out.println();

        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        /*
         *-----------------
         * The General Idea
         * ----------------
         * Draw the triangle top down calculating the length of padding based on the size of the base.
         * Since each new line is only as long as the base, we know that each line consists of n * 2 characters.
         *
         * We know that from top to bottom:
         * - Each new layer of the triangle increases by two asterisks.
         * - The remainder is all padding
         * - The left and right padding are symmetrical
         *
         * Thus:
         * At each layer we draw the left padding, the number of asterisks in a layer, and the right padding
         */

        int numBase = (n * 2)-1; //# of asterisks that the base consist of
        int start = 1;           //# of asterisks the tip of the triangle has

        //We work our way down starting from the top
        for (int i = 0; i < n; i++, start+=2){
            int currPadding = (numBase - start)/2;

            //print left padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            //print horizontal slice of triangle
            for (int j = 0; j < start; j++){
                System.out.print("*");
            }

            //print right padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            System.out.println();
        }


    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        int numBase = (n * 2)-1;

        //Work our way in reverse, skip from drawing the base twice
        int start = numBase - 2;
        for (int i = 0; i < n; i++, start-=2){
            int currPadding = (numBase - start)/2;

            //print left padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            //print horizontal slice of triangle
            for (int j = 0; j < start; j++){
                System.out.print("*");
            }

            //print right padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int numBase = (n * 2)-1; //# of asterisks that the base consist of
        int start = 1;           //# of asterisks the tip of the triangle has

        //We work our way down starting from the top
        //similar to first exercise except we don't draw the base...
        // the base becomes our name
        for (int i = 1; i < n; i++, start+=2){
            int currPadding = (numBase - start)/2;

            //print left padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            //print horizontal slice of triangle
            for (int j = 0; j < start; j++){
                System.out.print("*");
            }

            //print right padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        //Write our name
        System.out.println("Salvador");

        //Work our way down
        start -= 2;

        for (int i = 1; i < n; i++, start-=2){
            int currPadding = (numBase - start)/2;

            //print left padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            //print horizontal slice of triangle
            for (int j = 0; j < start; j++){
                System.out.print("*");
            }

            //print right padding
            for (int j = 0; j < currPadding; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
