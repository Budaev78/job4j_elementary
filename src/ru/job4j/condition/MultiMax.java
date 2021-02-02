package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            if (first > third) {
                result = first;
            }
        } else if (second > third) {
            result = second;
        } else if (third > second) {
            result = third;
        }
        return result;
    }
}
