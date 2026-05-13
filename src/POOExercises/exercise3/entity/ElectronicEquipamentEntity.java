package POOExercises.exercise3.entity;

import java.util.ArrayList;
import java.util.List;

public class ElectronicEquipamentEntity {

    private final List<ElectronicEquipamentAbstract> listOfEquipment;

    public ElectronicEquipamentEntity(List<ElectronicEquipamentAbstract> listOfEquipment) {
        this.listOfEquipment = listOfEquipment;
    }

    public List<ElectronicEquipamentAbstract> getListOfEquipment() {
        return listOfEquipment;
    }

    @Override
    public final String toString(){
        for(ElectronicEquipamentAbstract item : listOfEquipment){
            return item.toString();
        }

        return "\n";
    }
}
