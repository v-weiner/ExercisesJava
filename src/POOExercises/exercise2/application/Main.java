package POOExercises.exercise2.application;

import POOExercises.exercise2.entity.FinanceDataEntity;
import POOExercises.exercise2.service.FinanceStatisticsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        FinanceDataEntity financialData1 = new FinanceDataEntity(15);
        FinanceDataEntity financialData2 = new FinanceDataEntity(20);
        FinanceDataEntity financialData3 = new FinanceDataEntity(20);
        List<Integer> list = new ArrayList<>();
        list.add(financialData1.getFinanceData());
        list.add(financialData2.getFinanceData());
        list.add(financialData3.getFinanceData());

        FinanceStatisticsService <Integer> financeStatistics = new FinanceStatisticsService<>(list);

        double financialDataAverage = financeStatistics.calculateAverage();
        System.out.printf("Average: %.2f\n", financialDataAverage);
        financeStatistics.displayFormatedData(financialDataAverage);
    }
}
