import java.util.Comparator;
import java.util.List;

public class StreamAPIs {
    public static void main(String[] args) {
        
        System.out.println("Streams & SteamAPIs in Java");

        // Stream    -     Stream API       -     Lambda Expressions 
        // What is a Stream? A Stream is a sequence of elements from a source (collection, array, file) 
        // that supports functional-style operations (filter, map, reduce) and processes data declaratively — 
        // what to do, not how.

        List<Integer> ages = List.of(56, 43, 67, 88, 93, 32, 11, 78);

        ages.stream().forEach(x -> System.out.print(x));
        
        List<Integer> lessAge = ages.stream().filter(x -> x < 50).toList();

        System.out.println("Ages Less than 50 : " + lessAge);

        // filter() - find even ages 
        List<Integer> evenAges = ages.stream().filter(x -> x % 2 == 0).toList();

        System.out.println("Even Number Ages: " +  evenAges);


        //  map(Function) — transform each element

        List<String> names = List.of("rahul", "deepesh", "Vivek", "Akshay", "Nishant");

        List<String> upperNames = names.stream().map(String::toUpperCase).toList();

        System.out.println("Upper Case Names" + upperNames);

        // Find Name Startswith A 
        List<String> findName = names.stream().filter(x -> x.startsWith("A")).toList();

        System.out.println("Finding Name Start With A: " + findName);

        // flatMap(Function) — flatten nested structures
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4), List.of(5));
        List<Integer> flat = nested.stream()
                           .flatMap(List::stream)
                           .toList();
        System.out.println(flat);    // [1, 2, 3, 4, 5]


        // distinct() - Find Unique in Collections

        List<Integer> nums = List.of(1, 3, 3, 1, 4, 5, 5, 4, 2, 3);

        List<Integer> distinct = nums.stream().distinct().toList();

        System.out.println("Distinct Value from Lists : " + distinct);

        // Sorted() / Sorted(comparator)  - Sort Values , Integer or String 

        List<Integer> marks = List.of(56, 34, 78, 23, 12, 22, 11, 87, 54, 33);

        List<String> name = List.of("vivek", "arjun", "Akshay", "Deepesh", "Nishant", "Mandar", "Arib");

        List<Integer> sortedMarks = marks.stream().sorted().toList();
        List<Integer> reverseSorted = marks.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Collection Sorted Marks : " + sortedMarks);
        System.out.println("Collection ReverseSorted Marks : " + reverseSorted);


        


        



        // A lambda expression is a short anonymous function — 
        // a block of code you can pass around like a value — introduced in Java 8. 
        // Why lambda? — The key idea ,Lambdas implement functional interfaces (interfaces with one abstract method):







        //     Collections                        Streams 

        //     Store Data                     Process Data  
    }
}
