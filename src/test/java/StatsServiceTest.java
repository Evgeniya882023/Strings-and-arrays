
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
        // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    void minSalesTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        // вызываем целевой метод:
        int minSalesMonth = service.minSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, minSalesMonth);
    }

    @Test
        //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    void maxSalesTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        // вызываем целевой метод:
        int maxSalesMonth = service.maxSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, maxSalesMonth);
    }

    @Test
        //сумма всех продаж
    void totalSalesAmountTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        // вызываем целевой метод:
        long sumSales1 = service.totalSalesAmount(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, sumSales1);
    }

    @Test
        //средняя сумма всех продаж
    void averageSalesAmountTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        // вызываем целевой метод:
        long averageSumSales = service.averageSalesAmount(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, averageSumSales);
    }

    @Test
        //количество месяцев, в которых продажи были ниже среднего
    void underMonthAverageSalesTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        // вызываем целевой метод:
        long underMonthAverageSalesAmount = service.underMonthAverageSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, underMonthAverageSalesAmount);
    }

    @Test
        //количество месяцев, в которых продажи были выше среднего
    void overMonthAverageSalesTest() {
        StatsService service = new StatsService();
        // подготавливаем данные:
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        // вызываем целевой метод:
        long overMonthAverageSalesAmount = service.overMonthAverageSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, overMonthAverageSalesAmount);
    }
}
