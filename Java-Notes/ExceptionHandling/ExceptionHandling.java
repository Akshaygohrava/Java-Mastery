

public class ExceptionHandling {
    public static void main(String[] args) {
        
        System.out.println("Exception Handling In Java");

        // An exception is an event that disrupts the normal flow of a program. 
        // Exception handling lets you detect, respond to, and recover from these events instead of crashing.


        // Exception Handling With Try Catch Block 
        // int result = 10 / 0;   // this will create an error .....


        try {
            int result = 10 / 0;       // Error is Handle With Try / Catch 
            System.out.println(result);      // skipped
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero");
            System.out.println("Caught: " + e.getMessage());   // / by zero
        }
        System.out.println("Program continues ...");

        int[] marks = {34, 56, 22, 78, 44, 61, 47, 88}; 
        System.out.println(marks[0]);    // now, this will print , beacuse error was handle by try catch   

        try {
            System.out.println(marks[9]);
        } catch (Exception e) {
            System.out.println(e + " Error ");
        }

        // Without handling, the JVM prints the stack trace and terminates the program. One bad line kills everything.


        // Try / Catch with Multiple Blocks 
        try {
            String s = args[0];             // may throw ArrayIndexOutOfBoundsException
            int n = Integer.parseInt(s);    // may throw NumberFormatException
            int r = 100 / n;                // may throw ArithmeticException
            System.out.println(r);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument given");
        } catch (NumberFormatException e) {
            System.out.println("Not a number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        System.out.println("Done");
    
    // Multi-Catch (Java 7+) — One block, many types
    try {
          int result = 35 / 0;
          System.out.println(result);

          int[] num = {23, 54, 67};
          System.out.println(num[3]);
     } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
          System.out.println("Bad input: " + e.getMessage());
     }





    }
}
