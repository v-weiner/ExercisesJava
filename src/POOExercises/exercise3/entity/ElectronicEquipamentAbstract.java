package POOExercises.exercise3.entity;

public abstract class ElectronicEquipamentAbstract {
    private String equipamentID;
    private String equipamentType;

    public ElectronicEquipamentAbstract(String equipamentID, String equipamentType) {
        this.equipamentID = equipamentID;
        this.equipamentType = equipamentType;
    }

    public ElectronicEquipamentAbstract() {

    }

    public String getEquipamentID() {
        return equipamentID;
    }

    public void setEquipamentID(String equipamentID) {
        this.equipamentID = equipamentID;
    }

    public String getEquipamentType() {
        return equipamentType;
    }

    public void setEquipamentType(String equipamentType) {
        this.equipamentType = equipamentType;
    }
}
