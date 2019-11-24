package collection.set.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main( String[] args ) {
        HashSetExample1 hse = new HashSetExample1();
        hse.hashSetSample();
    }

    public void hashSetSample(){
        Set<String> set = new HashSet<>();

        set.add("I");
        set.add("LOVE");
        set.add("YOU");
        set.add("SO");
        set.add("MUCH");

        System.out.println("size : " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        set.remove("SO");
        set.remove("MUCH");
        set.remove("LO~~~VE");

        System.out.println();
        System.out.println("size : " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println();
        for(String element : set){
            System.out.println(element);
        }

        set.clear();
        if(set.isEmpty()){
            System.out.println();
            System.out.println("set is empty.");
        }
    }
}
