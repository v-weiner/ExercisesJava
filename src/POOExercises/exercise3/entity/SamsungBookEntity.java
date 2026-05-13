package POOExercises.exercise3.entity;

import java.util.List;

public class SamsungBookEntity extends ElectronicEquipamentAbstract{
    public SamsungBookEntity(String equipamentID, String equipamentType){
        super(equipamentID,equipamentType);
    }

    @Override
    public String toString(){
        return "Item: " + getEquipamentType();
    }
}
