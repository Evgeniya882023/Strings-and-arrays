package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int minSalesMonth = service.minSales(sales);
        System.out.println(minSalesMonth);
        int maxSalesMonth = service.maxSales(sales);
        System.out.println(maxSalesMonth);
        long sumSales1 = service.totalSalesAmount(sales);
        System.out.println(sumSales1);
        long averageSumSales = service.averageSalesAmount(sales);
        System.out.println(averageSumSales);
        long underMonthAverageSalesAmount = service.underMonthAverageSales(sales);
        System.out.println(underMonthAverageSalesAmount);
        long overMonthAverageSalesAmount = service.overMonthAverageSales(sales);
        System.out.println(overMonthAverageSalesAmount);
    }
}
