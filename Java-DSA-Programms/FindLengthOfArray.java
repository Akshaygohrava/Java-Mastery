import java.util.HashSet;

public class FindLengthOfArray {
    public static void main(String[] args) {
        System.out.println("Find Length Of Array , but Not Dublicates One !");

        int[] marks = {43, 45, 56, 43, 56, 65, 33, 43};

        HashSet<Integer> uniqueval = new HashSet<>();
        for(int num : marks) {
        uniqueval.add(num);
        }

        System.out.println("Original Length : " + marks.length);

        System.out.println("Without Dublicates Length : " + uniqueval.size());

    }
}