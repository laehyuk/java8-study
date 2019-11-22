package collection.list.linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main( String[] args ) {
        linkedvsArray();
    }

    public static void linkedvsArray(){
        List<String> array = new ArrayList<>();
        List<String> linked = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i=0 ; i<10000 ; i++){
            array.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList's Time : " + (endTime - startTime) );
        System.out.println();

        startTime = System.nanoTime();
        for(int i=0 ; i<10000 ; i++){
            linked.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList's Time : " + (endTime - startTime) );


    }
}
