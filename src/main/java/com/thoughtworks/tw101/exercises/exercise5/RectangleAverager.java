package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float sumOfAvgs = 0;
        for (Rectangle rect: rectangles) {
            sumOfAvgs += rect.area();
        }

        return sumOfAvgs/rectangles.length;
    }
}
