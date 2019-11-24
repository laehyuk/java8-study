package collection.map.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main( String[] args ) {
        runHashMap();
    }

    public static void runHashMap(){
        Map<String, Integer> map = new HashMap<>();

        map.put("프랭크",30);
        map.put("지미",40);
        map.put("러셀",20);
        map.put("프랭크",90);

        System.out.println("size : " + map.size());
        System.out.println("프랭크 : " + map.get("프랭크"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println();

        map.remove("프랭크");
        System.out.println("size : " + map.size());
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
        map.clear();
        if(map.isEmpty()){
            System.out.println("map is empty.");
        }

    }
}
