import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        //[1][2][3][4][5] -> [1][2][3][4][5][6] добавляем элемент не влияя на размер внутреннего масива (arraylist)
        //[1][2][3][4][5] -> [6][1][2][3][4][5] нужно доюавить в начало и сдвинуть все эелементы (linkedList)
        //в случаке с линклистом хранятся узлы значений и есть ссылка на следующий узел
        // head -> [1] -> [2] -> [3] -> [4] при добавлении head -> [5] -> [1] -> [2] -> [3] -> [4]
        //если много записей в конец листа и чтения из листа, то использовать arrayList
        //если много удалений и добавления в начало, то  linkedList
        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }

        //[] -> [0] -> [0][1] -> [0][1][2]...[n](list.add(i))
        //[] -> [0] -> [1][0] ->[n]...[2][1][0](list.add(0,i))

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
