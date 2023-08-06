

package netology;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax1() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-3, -9, -6, -5, -2, -9, -13, -12, -1, -8, -10};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}