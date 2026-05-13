package POOExercises.exercise3.entity;

import java.util.List;

public class MacbookEntity extends ElectronicEquipamentAbstract{
    public MacbookEntity(String equipamentID, String equipamentType){
        super(equipamentID,equipamentType);
    }

    @Override
    public String toString(){
        return "Item: " + getEquipamentType();
    }
}
