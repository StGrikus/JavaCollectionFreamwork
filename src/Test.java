import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for(Integer x : arrayList)
            System.out.println(x);

        arrayList.remove(5);
        System.out.println(arrayList);

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(j);
        }
        list.remove(4);
        System.out.println(list);

        //мы проводим много удалений
        list = new LinkedList<Integer>();

    }
}
