import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        
        System.out.println("Exception Handling 2 In Java");

        // FInally - Always Runs
         try {
            System.out.println("try");
            int x = 1 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally — always runs");
        }

        // try-with-resources (Java 7+) — Automatic Cleanup
        // Any object implementing AutoCloseable gets close() called automatically, even on exception.

        try (FileReader fr = new FileReader("data.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // fr.close() called automatically ✅  // No finally, no null checks, no leaks.

        try {
            System.out.println("1. try start");
            throw new RuntimeException("boom");
        } catch (RuntimeException e) {
            System.out.println("2. catch: " + e.getMessage());
        } finally {
            System.out.println("3. finally");
        }
        System.out.println("4. after try");



        // printStackTrace vs getMessage vs toString
        try {
           int x = 1 / 0;
       } catch (Exception e) {
          System.out.println(e.getMessage());    // "/ by zero"
          System.out.println(e.toString());      // "java.lang.ArithmeticException: / by zero"
          e.printStackTrace();                   // full trace to stderr
       }


       
        
    }
}
