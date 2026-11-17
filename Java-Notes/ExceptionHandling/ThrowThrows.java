public class ThrowThrows {
    public static void main(String[] args) {
        
        System.out.println("Exception Handling With Throw and Throws ");

        // Exception Handling with Throw, Throws 
        // throw — Manually Raise an Exception
        // throw = you raise it. throws = you declare it might happen.

        checkAge(15);   // throw Exception , with throw keywords 
        checkAge(25); //  No Error

        // throws — Declare, Don't Handle
        try {
            check();
    
        } catch (Exception e) {
            System.out.println("Problem : " +  e.getMessage());
        }


    }
    
    // throw - manually raise an exception
    public static void checkAge(int age) {   
        try {
            if (age < 18) {
            throw new IllegalArgumentException("Age Cannot be Less than 18");  // throw exception
        }
        else System.out.println("Else Allowed ");
        } catch (Exception e) {
            System.out.println("Age Cannot Less than 18");
        }
    }

    // throws -- declare , not handle 
    public static void check() throws ArithmeticException {
        int result = 10 / 0;
        System.out.println(result);
    }


}


// throws vs throw vs try-catch — Cheat Sheet
// Keyword	Meaning
// throw	Raise an exception instance: throw new X()
// throws	Declare in method signature that method may throw
// try-catch	Handle an exception here

//           finally vs try-with-resources — Which to Use?
// finally	try-with-resources
// For non-resource cleanup (logging, flags)	✅	❌
// For closing streams/files/connections	⚠️ verbose, bug-prone	✅ always use
// Suppresses exceptions properly	❌	✅
// Rule: use try-with-resources for AutoCloseable (streams, files, sockets, DB). Use finally only for non-resource cleanup.