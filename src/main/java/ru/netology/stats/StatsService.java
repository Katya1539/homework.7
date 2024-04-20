package ru.netology.stats;

public class StatsService {
    public int sumAll(int[] sales) {
        int all = 0;
        for (int i = 0; i < sales.length; i++) {
            all = all + sales[i];
        }
        return all;
    }

    public int sumMiddle(int[] sales) {
        int all = 0;
        for (int i = 0; i < sales.length; i++) {
            all = all + sales[i];
        }
        int middle = all / 12;
        return middle;
    }

    public int maxMonth(int[] sales) {
        int max = 0;
        for (int t = 0; t < sales.length; t++) {
            if (sales[t] >= sales[max]) {
                max = t;
            }
        }
        return max + 1;
    }

    public int minMonth(int[] sales) {
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {
                min = i;
            }
        }
        return min + 1;
    }
}
