package collection.set.hash;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main( String[] args ) {
        hashSetSample();
    }

    public static void hashSetSample(){
        Set<Member> set = new HashSet<>();

        set.add(new Member("카네기", 30));
        set.add(new Member("카네기", 30));
        set.add(new Member("록펠러", 26));

        System.out.println("size : " + set.size());
    }
}
