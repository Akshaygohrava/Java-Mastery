import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {

        System.out.println("Java Collections");
        System.out.println("Lists In Collection !");

        // ArrayList - Best For Frequent fast read, index access, random access, iteration
        // allow duplicates, insertation order maintain , allow multple null keys
        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(37);
        marks.add(54);
        marks.add(48);
        marks.add(69);
        marks.add(52);
        marks.size();
        marks.isEmpty();
        // marks.clear();
        marks.contains(69);
        marks.indexOf(54);
        marks.lastIndexOf(52);
        marks.toArray();

        System.out.println(marks);

        marks.add(93);  // Add Last
        marks.add(0, 77); // Add First 
        marks.get(2); // get value
        System.out.println(marks.get(2)); //Get Value
        marks.remove(3); // Remove
        marks.set(2, 64); // Modify 
        marks.size(); // return collection length 

        System.out.println("ArrayList : " + marks);

        // Iterate Lists
        for(int value : marks) {
            System.out.print(value);
        }



        // Linked List - is best for Insert and Remove via iterate 

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

        System.out.println("LinkedList : " + name);


        // ArrayList                       LinkedList

        // Resizeable array                Doubly linkedlist
        // Best for faster random access   faster insert/deletion
        // Both , Maintain Insertion order. Dublicate allow, Null Value allow, Not thread safe
      

        // Stack - Extend Vector - LIFO Behaviour - both are thread safe , allow duplicate , null values  

        Stack<Integer> age = new Stack<>();

        age.add(56);
        age.add(78);
        age.add(99);
        age.add(44);
        age.add(68);

        age.push(56);  // add to the top
        age.pop(); // remove and return from top
        age.peek();  // view top 
        age.empty(); // true if empty
        age.search(4); // 1 based position

        System.out.println("Stack :" + age);

        // allow add, get , set. remove, size 

        // Best for LIFO behavior — but ArrayDeque is recommended today (faster, not synchronized).


        // Vector - is extended version of Stack 

        Vector<Integer> level = new Vector<>();

        level.add(55);
        level.add(21);
        level.add(78);
        level.add(65);
        level.add(89);

        System.out.println("Vector :" + level);






        // Backed by: Resizable array (like ArrayList)
        // Thread-safe: ✅ Yes (all methods synchronized)

        
    }
}
