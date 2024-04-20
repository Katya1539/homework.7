package ru.netology.stats;

public class StatsService {
    public int sumAll(int[] sales) {
        int all = 0;
        for (int i =0; i < sales.length; i++) {
            all = all + sales[i];
        }
        return all;
    }

    public int sumMiddle(int[] sales) {
        int all = 0;
        for (int i =0; i < sales.length; i++) {
            all = all + sales[i];
        }
        int middle = all / 12;
        return middle;
    }

    public int maxMonth(int[] sales) {
        int max = sales[0];
            for (int t : sales) {
                if (t < max) {
                    max = t;
                }
            }
            return max;
    }
}
