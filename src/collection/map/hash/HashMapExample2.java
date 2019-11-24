package collection.map.hash;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main( String[] args ) {
        runHashMap();
    }

    public static void runHashMap(){
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "프랭크"), 100);
        map.put(new Student(1, "프랭크"), 100);

        System.out.println("size : " + map.size());
        System.out.println();


    }
}
