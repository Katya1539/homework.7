package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {4, 22, 13, 6, 8, 17, 20, 13, 21, 18, 16, 10};

        System.out.println(Arrays.toString(sales));
        System.out.println("Сумма продаж - " + service.sumAll(sales));
        System.out.println("Средняя сумма продаж - " + service.sumMiddle(sales));
        System.out.println("Месяц максимальных продаж - " + service.maxMonth(sales));
        System.out.println("Месяц минимальных продаж - " + service.minMonth(sales));
        System.out.println("Колличество месяцев с продажами ниже среднего - " + service.belowMiddle(sales));
        System.out.println("Колличество месяцев с продажами выше среднего - " + service.aboveMiddle(sales));

    }
}