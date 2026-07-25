import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence DSA Programms !");

        // Fibonacci is just adding the last two numbers to get the next number.
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Fibonacci Number To Print : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("F(" + i + ") = " + a);
            
            int next = a + b;  // Add to get next
            a = b;              // Move forward
            b = next;           // Move forward
        }
        
        sc.close();


        


    }
}
