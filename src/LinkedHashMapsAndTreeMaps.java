import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapsAndTreeMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантировано порядка
        Map<Integer, String> linkHashMap = new LinkedHashMap<>();// в каком порядке были добавлены (ключб значение)
        //в таком и вернутся
        Map<Integer, String> treeMap = new TreeMap<>();//пары (ключ, значение) сортирубтся по ключу
        testMap(hashMap);
        System.out.println();
        testMap(linkHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(23, "Arthur");
        map.put(19, "Anastasia");
        map.put(21, "Bob");
        map.put(1500, "Alex");
        map.put(8, "Anastasia");
        map.put(34, "Cost");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"|"+entry.getValue());
        }
    }
}
