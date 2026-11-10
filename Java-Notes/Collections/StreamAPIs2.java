import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIs2 {
    public static void main(String[] args) {
        
        System.out.println("StreamAPIs In Collections !");


         // All Method Examples
        List<String> namess= List.of("Akshay", "Rahul", "Vivek", "Om", "Siddhesh");

        // Keep names with length > 3, uppercase them, sort, collect to list
        List<String> result = namess.stream()
            .filter(n -> n.length() > 3)          // lambda (Predicate)
            .map(String::toUpperCase)             // lambda (Function)
            .sorted()                             // no lambda
            .collect(Collectors.toList());        // lambda-free terminal

        System.out.println(result);
        // [AKSHAY, RAHUL, SIDDHESH, VIVEK]


        List<Integer> nums = List.of(5, 3, 8, 1, 9, 2);

        System.out.println(nums);

        // Sum
        int sum = nums.stream().mapToInt(n -> n).sum();          // 28

        // Max
        int max = nums.stream().max((a, b) -> a - b).get();      // 9

        // Count even
        long evenCount = nums.stream().filter(n -> n % 2 == 0).count();  // 3

        // Reduce (product)
        int product = nums.stream().reduce(1, (a, b) -> a * b);  // 2160

        System.out.println("Sum : " + sum + " Max of array : " + max + " Even count : " + evenCount + " Product : " + product);



         List<String> names = List.of(
            "Akshay", "Rahul", "Vivek", "Om", "Siddhesh", "Amit"
        );

        // 1. Filter names starting with 'A', uppercase, sort
        List<String> aNames = names.stream()
            .filter(s -> s.startsWith("A"))        // lambda
            .map(String::toUpperCase)              // method ref (lambda)
            .sorted()                              // natural sort
            .toList();
        System.out.println(aNames);                // [AKSHAY, AMIT]

        // 2. Group by length
        Map<Integer, List<String>> byLen = names.stream()
            .collect(Collectors.groupingBy(s -> s.length()));  // lambda
        System.out.println(byLen);

        // 3. Count total characters
        int total = names.stream()
            .mapToInt(String::length)              // method ref
            .sum();
        System.out.println("Total chars: " + total);

        // 4. forEach with lambda
        names.forEach(s -> System.out.println("Hello " + s));

        // 5. Thread with lambda
        new Thread(() -> System.out.println("Thread running")).start();

    }
}
