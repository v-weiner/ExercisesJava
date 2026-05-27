package POOExercises.exercise5.application;

import POOExercises.exercise5.entities.BaseEvent;
import POOExercises.exercise5.entities.Event;
import POOExercises.exercise5.entities.InventoryReservedEvent;
import POOExercises.exercise5.entities.OrderPlacedEvent;
import POOExercises.exercise5.service.EventPipeline;

import java.util.*;

public class Main {
    static void main() {
        EventPipeline<BaseEvent> pipeline = new EventPipeline<>(new LinkedHashSet<>());

        OrderPlacedEvent listOrderPlacedEvent = new OrderPlacedEvent(new ArrayList<>());
        listOrderPlacedEvent.addNewEvents(new InventoryReservedEvent("BD-01"));
        listOrderPlacedEvent.addNewEvents(new InventoryReservedEvent("BD-02"));
        listOrderPlacedEvent.addNewEvents(new InventoryReservedEvent("BD-03"));
        listOrderPlacedEvent.addNewEvents(new InventoryReservedEvent("BD-01"));

        pipeline.ingest(listOrderPlacedEvent.getNewEvents());

        Collection<Event> databaseEvents = new ArrayList<>();
        pipeline.drainTo(databaseEvents);

        for (Event event : databaseEvents) {
            System.out.println(event.getEventID());
        }
    }
}
