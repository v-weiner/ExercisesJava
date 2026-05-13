package POOExercises.exercise3.application;

import POOExercises.exercise3.entity.ElectronicEquipamentEntity;
import POOExercises.exercise3.entity.MacbookEntity;
import POOExercises.exercise3.entity.NotebookEntity;
import POOExercises.exercise3.entity.SamsungBookEntity;
import POOExercises.exercise3.service.ElectronicEquipamentService;

import java.util.ArrayList;

public class Main {
    static void main() {
        ElectronicEquipamentEntity generalElectronics = new ElectronicEquipamentEntity(new ArrayList<>());
        NotebookEntity notebookBox = new NotebookEntity(new ArrayList<>());

        ElectronicEquipamentService.addItemsInList(notebookBox.getListOfNotebooks(), new MacbookEntity("01", "Macbook"));
        ElectronicEquipamentService.addItemsInList(notebookBox.getListOfNotebooks(), new SamsungBookEntity("01", "SamsungBook"));

        notebookBox.getNotebooksTypes();

        ElectronicEquipamentService.transferListToAnotherList(generalElectronics.getListOfEquipment(), notebookBox.getListOfNotebooks());

        ElectronicEquipamentService.getAllItemsInList(generalElectronics.getListOfEquipment());
    }
}
