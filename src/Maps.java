import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //1 -> [... ... ...]
        //2 -> [... ... ...]
        Map<Integer, String> map = new HashMap();

        map.put(1, "Единица");
        map.put(2, "Двойка");
        map.put(3, "Тройка");
        map.put(4, "Четверка");
        map.put(5, "Пятерка");
        map.put(6, "Шестерка");
        map.put(7, "Семерка");
        map.put(8, "Восьмерка");
        map.put(9, "Девятка");
        map.put(10, "Десятка");
/*
        System.out.println(map);

        map.put(3, "Другое значение для ключа 3");

        System.out.println(map);

        System.out.println(map.get(10));

 */
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
