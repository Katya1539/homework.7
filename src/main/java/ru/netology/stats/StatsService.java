package ru.netology.stats;

public class StatsService {
    public long sumAll(long[] sales) {
        long all = 0;
        for (int i = 0; i < sales.length; i++) {
            all = all + sales[i];
        }
        return all;
    }

    public long sumMiddle(long[] sales) {
        long all = 0;
        for (int i = 0; i < sales.length; i++) {
            all = all + sales[i];
        }
        long middle = all / 12;
        return middle;
    }

    public int maxMonth(long[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minMonth(long[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public long belowMiddle(long[] sales) {
        long allMonthBelow = 0;
        long middle = sumMiddle(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                allMonthBelow = allMonthBelow + 1;
            }
        }
        return allMonthBelow;
    }

    public long aboveMiddle(long[] sales) {
        long allMonthAbove = 0;
        long middle = sumMiddle(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= middle) {
                allMonthAbove = allMonthAbove + 1;
            }
        }
        return allMonthAbove;
    }
}
