import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparableComparator {
    public static void main(String[] args) {

        // Comparaable And Comparator in Java ........

        System.out.println("Comparaable And Comparator in Java ........");


        int[] num = {23, 56, 34, 12, 75, 34, 22};

        LinkedList<Integer> list = new LinkedList<>();

        list.add(45);
        list.add(32);
        list.add(12);
        list.add(68);
        list.add(17);

        System.out.println("Number Array Sort : " + Arrays.toString(num));
        System.out.println("Collection Sorting : " + list);

        Collections.sort(list);
        Arrays.sort(num);

        System.out.println("Sorted Array : " + Arrays.toString(num));
        System.out.println("Sorted List  : " + list);


        //   Comparable (natural ordering — automatic)
        Collections.sort(list);              // if list elements are Comparable
        Arrays.sort(num);                  // if elements are Comparable
        new TreeSet<>();                     // natural order
        new TreeMap<>();                     // natural key order
        new PriorityQueue<>();               // natural priority








        // Comparator (custom ordering)

        List<Integer> nums = new ArrayList<>(List.of(30, 10, 20, 50, 40));

        // Comparator as lambda: (a, b) -> b - a  → descending
        nums.sort((a, b) -> b - a);

        System.out.println(nums);   // [50, 40, 30, 20, 10]

        // (a, b) -> b - a → descending
        // (a, b) -> a - b → ascending (same as default)




        //  Using Comparator.comparing
        List<String> names = new ArrayList<>(List.of("Akshay", "Rahul", "Vivek", "Om"));

        // Ascending (natural)
        names.sort(Comparator.naturalOrder());
        System.out.println(names);   // [Akshay, Om, Rahul, Vivek]

        // Descending
        names.sort(Comparator.reverseOrder());
        System.out.println(names);   // [Vivek, Rahul, Om, Akshay]


        
        // Collections.sort(list, comparator);          // overloaded
        // list.sort(comparator);                       // Java 8+
        // Arrays.sort(array, comparator);              // overloaded
        // new TreeSet<>(comparator);                   // custom order
        // new TreeMap<>(comparator);                   // custom key order
        // new PriorityQueue<>(comparator);             // custom priority
        // stream.sorted(comparator);                   // stream


        // Comparable = "the object knows how to sort itself" (one natural order).
        // Comparator = "a rule decides how to sort objects" (many orders, outside the class).
        
    }
}
