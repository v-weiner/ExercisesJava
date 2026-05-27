package POOExercises.exercise5.entities;

import java.util.Objects;

public abstract class BaseEvent implements Event{
    private final String eventID;

    public BaseEvent(String eventID){
        this.eventID = eventID;
    }

    @Override
    public String getEventID() {
        return eventID;
    }   

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseEvent baseEvent = (BaseEvent) o;
        return Objects.equals(eventID, baseEvent.eventID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(eventID);
    }
}
