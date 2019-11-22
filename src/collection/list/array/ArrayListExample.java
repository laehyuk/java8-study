package collection.list.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main( String[] args ) {
        arrayRemove();
        arraysAslist();
    }

    public static void arrayRemove(){
        List<String> list = new ArrayList<>();

        list.add("I");
        list.add("LOVE");
        list.add("YOU");
        list.add("SO");
        list.add("MUCH");

        for(String l : list){
            System.out.println(l);
        }

        System.out.println();
        list.remove(list.size()-1);
        list.remove(list.size()-1);

        for(String l : list){
            System.out.println(l);
        }
        System.out.println();
    }

    public static void arraysAslist(){
        List<String> list = Arrays.asList("I", "LOVE", "YOU");

        for(String l : list){
            System.out.println(l);
        }
    }
}
