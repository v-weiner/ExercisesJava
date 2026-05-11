package POOExercises.exercise2.service;

import java.util.List;

public class FinanceStatisticsService <T extends Number>{
    private List<T> financeData;

    public FinanceStatisticsService(){

    }

    public FinanceStatisticsService(List<T> financeData){
        this.financeData = financeData;
    }

    public void getAllFinanceData(){
        System.out.println("Financial Data: ");
        for (Number data : financeData){
            System.out.println(data.toString());
        }
    }

    public double calculateAverage(){
        double average = 0;
        for (T data : financeData){
            average += data.doubleValue();
        }

        return average / financeData.size();
    }

    public void displayFormatedData(Double average){
        System.out.printf("Average (Double format): %.2f", average);
        System.out.printf("\nAverage (Integer format): " + average.intValue());
    }
}
