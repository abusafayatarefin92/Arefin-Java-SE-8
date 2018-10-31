
import java.util.*;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedhashMap = new LinkedHashMap<>(16, 0.75f, true);

        linkedhashMap.put("Smith", 30);
        linkedhashMap.put("Anderson", 31);
        linkedhashMap.put("Lewis", 29);
        linkedhashMap.put("Cook", 29);

        System.out.println("\nThe age for " + "Lewis is " + linkedhashMap.get("Lewis"));

        System.out.println("Display entries in LinkedHashmap");
        System.out.println(linkedhashMap);
    }
}
