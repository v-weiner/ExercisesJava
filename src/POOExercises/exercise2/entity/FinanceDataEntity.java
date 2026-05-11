package POOExercises.exercise2.entity;

public class FinanceDataEntity {
    private Integer financeData;

    public FinanceDataEntity() {

    }

    public FinanceDataEntity(Integer financeData){
        this.financeData = financeData;
    }

    public Integer getFinanceData(){
        return this.financeData;
    }

    public void setFinanceData(Integer financeData){
        this.financeData = financeData;
    }
}
