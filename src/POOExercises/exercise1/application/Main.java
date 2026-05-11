package POOExercises.exercise1.application;

import POOExercises.exercise1.entity.CacheBoxEntity;

public class Main {
    static void main() {
        CacheBoxEntity cache = new  CacheBoxEntity();
        cache.setContent("");
        System.out.println(cache.getContent() + ", " + cache.isEmpty());
    }
}
