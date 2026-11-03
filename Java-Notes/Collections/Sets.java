import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        
        System.out.println("Sets In Collection");

        // Sets - Duplicates Not Allowed , Only one null allow, except TreeSet , No Index get(1) - Iterate ,Not Thread Safe 
        // HashSet - LinkedHashSet - TreeSet

        // HashSet  - One Null , No Order 

        HashSet<Integer> score = new HashSet<>();

        score.add(75);
        score.add(42);
        score.add(89);
        score.add(42);  // Length : 8, but shows only 6, two same value 75,42 will count 1 times
        score.add(98);
        score.add(75);
        score.add(69);
        score.add(33);

        score.remove(3);
        score.contains(42);
        score.isEmpty();
        score.size();
     //  score.clear();
        score.addAll(score);
         score.toArray(); // Convert to Normal Array 
         System.out.println(score.length);



        System.out.println("HashSet : " + score );
        System.out.println("Count : " + score.size());


        // LinkedHashSet -  One null, Insertion Order

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Akshay");
        names.add("Vivek");
        names.add("Rahul");
        names.add("Deepesh");
        names.add("Shubham");
        
        for(String a : names) {
            System.out.print(a);
        }

        System.out.println("LinkedHashSet : " + names);


        // TreeSet  - No Null, Sorted Order

        TreeSet<Integer> age = new TreeSet<>();

        age.add(68);
        age.add(31);
        age.add(77);
        age.add(25);
        age.add(53);


    //  age.add(null);   gives NullPointerException Error 

        System.out.println("TreeSet : " + age);
        System.out.println("Smallest : " + age.first());
        System.out.println("Largest : " + age.last());
        System.out.println("HadeSet < : " + age.headSet(77));
        System.out.println("TailSet >= : " + age.tailSet(77));
        System.out.println("SubSet between : " + age.subSet(31, 77));


        //       HashSet             LinkedHashSet                 TreeSet 

        //    No Duplicates           No Duplicates               No Duplicates
        //    Not Thread Safe         Not Thread Safe             Not Thread Safe
        //    only one null            one null                   null not allow
        //     No Order             Insertion Order              Sorted Order
        //     Fastest               Sightly slow than HashSet      Slowest




    }
}
