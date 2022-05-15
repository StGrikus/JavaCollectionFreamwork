import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        //union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //intersection - перечечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
/*        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Arthur");
        hashSet.add("Anastasia");
        hashSet.add("Konstantin");
        hashSet.add("Irina");
        hashSet.add("Sergey");

        System.out.println(hashSet.contains("Arthur"));
        System.out.println(hashSet.contains("Tom"));

        System.out.println(hashSet);

        for(String name : hashSet) {
            System.out.println(name);
        }

        System.out.println();

        linkedHashSet.add("Arthur");
        linkedHashSet.add("Anastasia");
        linkedHashSet.add("Konstantin");
        linkedHashSet.add("Irina");
        linkedHashSet.add("Sergey");

        for (String name1 : linkedHashSet) {
            System.out.println(name1);
        }

        System.out.println();

        treeSet.add("Arthur");
        treeSet.add("Anastasia");
        treeSet.add("Konstantin");
        treeSet.add("Irina");
        treeSet.add("Sergey");

        for (String name2 : treeSet) {
            System.out.println(name2);
        }
        // a < b <c
        //aa < ab

 */
    }
}
