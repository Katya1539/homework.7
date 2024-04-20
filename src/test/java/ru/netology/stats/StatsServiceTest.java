package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void allSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.sumAll(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void middleSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddle = 15;
        int actualMiddle = service.sumMiddle(sales);

        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }
}
