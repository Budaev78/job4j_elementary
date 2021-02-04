package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] rsl = new int[100];
        int sum = money - price;
        while (sum > 0) {
            for (int j = 0; j < rsl.length; j++) {
                for (int i = 0; i < coins.length; i++) {
                    if (sum >= coins[i]) {
                        sum -= coins[i];
                        size++;
                        rsl[j] = coins[i];
                        break;
                    }

                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

