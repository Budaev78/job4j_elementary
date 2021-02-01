package ru.job4j.condition;

import java.util.Map;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double xPow = Math.pow(x, 2);
        double yPow = Math.pow(y, 2);
        double sum = xPow + yPow;
        return Math.sqrt(sum);

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(0, 3, 0, 6);
        System.out.println("result (0, 3) to (0, 6) " + result1);
        double result2 = Point.distance(10, 25, -15, 86);
        System.out.println("result (10, 25) to (-15, 86) " + result2);

    }

}
