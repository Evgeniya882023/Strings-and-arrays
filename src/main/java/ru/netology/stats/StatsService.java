package ru.netology.stats;

// номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; //двигаем ша на +1 , перебирая все месяцы
    }

    //сумма всех продаж
    public long totalSalesAmount(long[] sales) {
        long sumSales = 0;
        for (long i : sales) { //используем метод for each
            sumSales += i;
        }
        return sumSales;
    }

    //средняя сумма всех продаж
    public long averageSalesAmount(long[] sales) {
        long sumSales = 0;
        for (long i : sales) { //используем метод for each
            sumSales += i;
        }
        return sumSales / sales.length;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public long underMonthAverageSales(long[] sales) {
        int underMonth = 0;
        long averageSumSales = averageSalesAmount(sales); //присваиваем в переменную ранее написанный метод
        for (long i : sales) { //используем метод for each {
            if (i < averageSumSales) { //// если значение из массива меньше среднего, то увеличиваем счётчик underMonth на 1
                underMonth = underMonth + 1;
            }
        }
        return underMonth;
    }

    //количество месяцев, в которых продажи были выше среднего
    public long overMonthAverageSales(long[] sales) {
        int overMonth = 0;
        long averageSumSales = averageSalesAmount(sales); //присваиваем в переменную ранее написанный метод
        for (long i : sales) { //используем метод for each {
            if (i > averageSumSales) { //// если значение из массива меньше среднего, то увеличиваем счётчик underMonth на 1
                overMonth = overMonth + 1;
            }
        }
        return overMonth;
    }
}

