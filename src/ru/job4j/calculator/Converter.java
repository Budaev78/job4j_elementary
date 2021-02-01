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
