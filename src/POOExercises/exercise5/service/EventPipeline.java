package POOExercises.exercise5.service;

import POOExercises.exercise5.entities.BaseEvent;
import POOExercises.exercise5.entities.Event;
import POOExercises.exercise5.entities.OrderPlacedEvent;
import POOExercises.exercise5.exceptions.EmptyListEventsException;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EventPipeline <T extends Event> {
    private final Set<T> events;

    public EventPipeline(LinkedHashSet<T> events) {
        this.events = events;
    }

    public boolean ingest(List<? extends T> eventsList){
        try{
            if(eventsList.isEmpty()){
                throw new EmptyListEventsException("Empty List");
            }
        }
        catch(EmptyListEventsException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        events.addAll(eventsList);
        return true;
    }

    public boolean drainTo(Collection<? super T> orderedEvents){
        try{
            if(events.isEmpty()){
                throw new EmptyListEventsException("Empty List");
            }
        }
        catch(EmptyListEventsException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        orderedEvents.addAll(events);
        events.clear();
        return true;
    }
}
