package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int j = left.length; j < left.length + right.length; j++) {
            rsl[j] = right[j - left.length];
        }
        for (int i = 0; i < rsl.length - 1; i++) {
            if (rsl[i] > rsl[i + 1]) {
                int temp = rsl[i];
                rsl[i] = rsl[i + 1];
                rsl[i + 1] = temp;
            }
        }
        return rsl;
    }
}
