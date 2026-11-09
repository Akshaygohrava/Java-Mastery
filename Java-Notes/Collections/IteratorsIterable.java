import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsIterable {
    public static void main(String[] args) {

        System.out.println("Iterable and Iterators In Collections !");

        // Both are Interfaces ..........


        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(67);
        marks.add(35);
        marks.add(52);
        marks.add(78);
        marks.add(21);

        for(Integer i : marks) {
            System.out.println(i + " ");        // using foreach , to iterate values ...
            // compiler calls names.iterator() behind the scenes
        }
        System.out.println();

        Iterator<Integer> value = marks.iterator();   // calling

        while (value.hasNext()) {
            System.out.println(value.next());    // Using Iterator Interface
        }

        ArrayList<Integer> num = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        Iterator<Integer> values = num.iterator();

        System.out.println("hasnext() " + values.hasNext());   // true
        System.out.println("next() " + values.next());   // 10
        System.out.println("next() " + values.next());   // 20

        values.remove();  // remove() — removes the LAST element returned by next() -20
        System.out.println(num);  // 10, 30, 40, 50



        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        Iterator<String> it = list.iterator();
         while (it.hasNext()) {
           String s = it.next();
            if (s.equals("B")) {
                 it.remove();             // ✅ safe removal
              }
           }
          System.out.println(list);        // [A, C]





        // Iterator, Only Used On List, Sets , and Queues , Not in Maps 
        


        //          Iterable                          Iterator

        //         3 Methods                          4 Methods 
        //         Book                               Bookmark
        //         Iterate Over , value              keep tracks 
        //        iterator() method                  hasNext(), next(), remove() methods

        
    }
}
