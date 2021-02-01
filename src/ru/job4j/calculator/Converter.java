package ru.job4j.calculator;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
        int in3 = 3;
        int expected3 = 210;
        int out3 = Converter.euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("3 euro are 210. Test result : " + passed3);
        int in4 = 3;
        int expected4 = 180;
        int out4 = Converter.dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("3 dollars are 180. Test result : " + passed4);

        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int rubles = Converter.euroToRuble(3);
        System.out.println("3 euro are " + rubles + " rubles");
        rubles = Converter.dollarToRuble(3);
        System.out.println("3 dollars are " + rubles + " rubles");

    }
}
