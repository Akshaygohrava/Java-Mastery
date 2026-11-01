import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {

        System.out.println("Java Collections");
        System.out.println("Lists In Java !");

        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(37);
        marks.add(54);
        marks.add(48);
        marks.add(69);
        marks.add(52);

        System.out.println(marks);

        marks.add(93);  // Add Last
        marks.add(0, 77); // Add First 
        System.out.println(marks.get(2)); //Get Value
        marks.remove(3); // Remove
        marks.set(2, 64); // Modify 

        System.out.println(marks);



        // Linked List

        LinkedList<String> name = new LinkedList<String>();

        name.add("Deepesh");
        name.addFirst("Akshay");
        name.add("Rahul");
        name.add("Nishant");
        name.add("Siddhesh");
        name.add("Chandra");
        name.add("Mandar");
        name.add("Vivek");
        name.add("Arib");

        System.out.println(name);

        // Stack 

        Stack<Integer> age = new Stack<>();




        // Vector

        Vector<Integer> level = new Vector<>();

        

        
    }
}
