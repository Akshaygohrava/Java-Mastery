import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class FindMaxMinArray {
    public static void main(String args[]) {

        System.out.println("Arrays Programms !");
        System.out.println("Find Min & Max From Arrays");

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(54);
        marks.add(44);
        marks.add(67);
        marks.add(76);
        marks.add(66);
        marks.add(2, 67);
        System.out.println(marks.get(1));

        System.out.println(marks);
        
        Collections.sort(marks);
        System.out.println("Sorted Marks: " + marks); //Sort an Integer Array

        Collections.sort(marks, Collections.reverseOrder()); //Sort In Reverse
        System.out.println("Reverse Sorted: " + marks);

        System.out.println("Min Marks: " + Collections.min(marks)); // Highest Marks 
        System.out.println("Max Marks: " + Collections.max(marks));  // Lowest Marks 



        // Find Second Highest Array 
        int[] num = {34, 54, 65, 33, 41, 67};

        ArrayList<Integer> nums = new ArrayList<>();

        for(int values : num) {
            nums.add(values);
        }

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("Second Highest Number in Array : " + nums.get(1));










    }
}
