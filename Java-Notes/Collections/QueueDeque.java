import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class QueueDeque {
    public static void main(String[] args) {

        System.out.println("===== Queues and Deque in Collections =====");

        // Queue and Deque are two INTERFACES
        // PriorityQueue and ArrayDeque are CLASSES that IMPLEMENT them
        // PriorityQueue → implements Queue
        // ArrayDeque    → implements Deque (which extends Queue)

        // ==================================================
        // 1. PriorityQueue — orders by PRIORITY (not FIFO)
        // ==================================================
        PriorityQueue<String> names = new PriorityQueue<>();

        names.offer("Akshay");
        names.offer("Rahul");
        names.offer("Vivek");
        names.offer("Siddhesh");
        names.offer("Nishant");

        System.out.println("\nInitial PriorityQueue (heap order, NOT sorted):");
        System.out.println(names);

        // ---- peek: view head (smallest) WITHOUT removing ----
        System.out.println("peek()  → " + names.peek());

        // ---- poll: remove head (smallest) ----
        System.out.println("poll()  → " + names.poll());

        // ---- size / isEmpty ----
        System.out.println("size()  → " + names.size());
        System.out.println("isEmpty() → " + names.isEmpty());

        // ---- Full priority drain (alphabetical for Strings) ----
        System.out.println("\nDraining PriorityQueue (poll until empty):");
        while (!names.isEmpty()) {
            System.out.println("  " + names.poll());
        }
        System.out.println("isEmpty after drain → " + names.isEmpty());

        // ==================================================
        // 2. ArrayDeque — works as both STACK and QUEUE
        // ==================================================
        System.out.println("\n===== ArrayDeque (Deque interface) =====");

        Deque<String> deque = new ArrayDeque<>();

        // ---- Insert ----
        deque.addFirst("Akshay");     // [Akshay]
        deque.addLast("Rahul");       // [Akshay, Rahul]
        deque.offerFirst("Vivek");    // [Vivek, Akshay, Rahul]
        deque.offerLast("Siddhesh");  // [Vivek, Akshay, Rahul, Siddhesh]
        deque.push("Nishant");        // [Nishant, Vivek, Akshay, Rahul, Siddhesh]

        System.out.println("After inserts: " + deque);

        // ---- Peek ----
        System.out.println("peekFirst() → " + deque.peekFirst());
        System.out.println("peekLast()  → " + deque.peekLast());

        // ---- Remove ----
        System.out.println("pollFirst() → " + deque.pollFirst());
        System.out.println("pollLast()  → " + deque.pollLast());
        System.out.println("pop()       → " + deque.pop());   // stack-style

        System.out.println("After removals: " + deque);

        // ---- size / isEmpty ----
        System.out.println("size()  → " + deque.size());
        System.out.println("isEmpty() → " + deque.isEmpty());


        //      ArrayDeque                         PriorityQueue

        //    FIFO/LIFO Insertion based           Priority based , high and low 
        //    Insertion Order                      Not Sorted 
        //     

    
    }
}