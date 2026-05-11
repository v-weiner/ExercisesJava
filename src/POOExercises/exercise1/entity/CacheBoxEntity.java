package POOExercises.exercise1.entity;

public class CacheBoxEntity <T>{
    private T content;

    public CacheBoxEntity(){

    }

    public CacheBoxEntity(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean isEmpty(){
        return content == null;
    }
}
