package POOExercises.exercise3.entity;

import java.util.List;

public class NotebookEntity{
    private final List<ElectronicEquipamentAbstract> listOfNotebooks;

    public NotebookEntity(List<ElectronicEquipamentAbstract> listOfNotebooks) {
        this.listOfNotebooks = listOfNotebooks;
    }

    public final void getNotebooksTypes() {
        for (ElectronicEquipamentAbstract notebook : listOfNotebooks){
            System.out.printf("Notebook type: " + notebook.getEquipamentType() + "\n");
        }
    }

    public List<ElectronicEquipamentAbstract> getListOfNotebooks(){
        return  listOfNotebooks;
    }
}
