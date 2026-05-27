package POOExercises.exercise5.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderPlacedEvent {
    private final List<InventoryReservedEvent> newEvents;

    public OrderPlacedEvent(List<InventoryReservedEvent> newEvents) {
        this.newEvents = newEvents;
    }

    public List<InventoryReservedEvent> getNewEvents() {
        return newEvents;
    }

    public void addNewEvents(InventoryReservedEvent newEvent){
        newEvents.add(newEvent);
    }
}
