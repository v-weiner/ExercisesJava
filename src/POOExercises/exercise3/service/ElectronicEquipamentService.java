package POOExercises.exercise3.service;

import POOExercises.exercise3.entity.ElectronicEquipamentAbstract;
import POOExercises.exercise3.entity.ElectronicEquipamentEntity;

import java.util.List;

public class ElectronicEquipamentService {
    public static <T> void transferListToAnotherList(List<? super T> destinationList, List<? extends T> senderList){
        destinationList.addAll(senderList);
    }

    public static <T> void getAllItemsInList(List<? extends T> getList){
        for(T item : getList){
            System.out.println(item.toString());
        }
    }

    public static <T> void addItemsInList(List<? super T> getList, T item){
        getList.add(item);
    }
}
