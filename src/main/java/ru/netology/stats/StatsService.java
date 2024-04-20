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
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int belowMiddle(int[] sales) {
        int allMonthBelow = 0;
        for (int q = 0; q < sales.length; q++) {
            if (sales[q] < sumMiddle(sales)) {
                allMonthBelow = allMonthBelow + 1;
            }
        }
        return allMonthBelow;
    }

    public int aboveMiddle(int[] sales) {
        int allMonthAbove = 0;
        for (int z = 0; z < sales.length; z++) {
            if (sales[z] >= sumMiddle(sales)) {
                allMonthAbove = allMonthAbove + 1;
            }
        }
        return allMonthAbove;
    }
}
