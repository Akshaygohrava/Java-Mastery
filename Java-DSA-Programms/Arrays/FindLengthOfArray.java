import java.util.HashSet;
import java.util.List;

public class FindLengthOfArray {
    public static void main(String[] args) {
        System.out.println("Find Length Of Array , but Not Dublicates One !");

        int[] marks = {43, 45, 56, 43, 56, 65, 33, 43};

        System.out.println("Normal Arrays Length : " + marks.length);

        // Using HashSet
        HashSet<Integer> list = new HashSet<>();
        for(int num : marks) {
           list.add(num);
        }

        // Using Streams 
        List<Integer> distvalue = list.stream().distinct().toList();

        System.out.println("Original Length : " + marks.length);

        System.out.println("Without Dublicates Length Using HashSet : " + list.size());

        System.out.println("Distinct Value Using Streams : " + distvalue);
        System.out.println("Distinct Value Length Using Streams : " + distvalue.size());



    }
}