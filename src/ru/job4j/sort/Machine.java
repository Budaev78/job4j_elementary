package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] rsl = new int[100];
        int sum = money - price;
        for (int coin : coins) {
            while (sum >= coin) {
                sum -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}


