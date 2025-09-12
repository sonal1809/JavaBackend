package LLD1.collections.Iterator;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class AlternateMapIteratorDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println("Even entries:");
        Iterator<Map.Entry<Integer, String>> evenItr = new AlternateMapIterator<>(map, true);
        while (evenItr.hasNext()) {
            System.out.println(evenItr.next());
        }

        System.out.println("Odd entries:");
        Iterator<Map.Entry<Integer, String>> oddItr = new AlternateMapIterator<>(map, false);
        while (oddItr.hasNext()) {
            System.out.println(oddItr.next());
        }
    }
}
