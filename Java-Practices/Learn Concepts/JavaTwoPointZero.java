public class JavaTwoPointZero {

    // 1. SIMPLE METHOD (no parameters)
    static void testmethod() {
        int a = 5;
        int b = 8;
        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }

    // 2. METHOD WITH PARAMETERS
    static void demomethod(String fname, int age) {
        System.out.println("My Name is " + fname + ". I am " + age + " years old!");
    }

    // 3. METHOD OVERLOADING - Same name, different parameters and Different Datatypes 
    
    // Method to add two integers (USING VOID)
    static void add(int a , int b) {
        System.out.println(a + b * 2);
    }
    
    // Method to add three integers (different number of parameters)
    static int add(int x, int y, int z) {
        return x + y + z;
    }
    
    // Method to add two double numbers (different parameter types)
    static double add(double x, double y) {
        return x + y;
    }
    
    // Method to concatenate two strings (different parameter types)
    static String add(String x, String y) {
        return x + " " + y;
    }
   
    // Scope in Java 
    // In Java, Scope are Static Scope / Global Scope , Method Scope , Block Scope !

    // Recursion in Java, is Method is calling itself.


    static void recursion(int n) {
        if(n > 0) {
            System.out.println(n + " ");
            recursion(n-1);
        }
    }
    
    // Finding Factorial - CORRECTED VERSION
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for(int i = n; i > 1; i--) {
            result = result * i;
        }
        return result;
    }

    // Alternative: Factorial using recursion
    static int factRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factRecursive(n - 1);
    }

    public static void main(String args[]) {
        System.out.println("=== JAVA 2.0 - METHODS DEMO ===\n");
        
        // Calling simple method
        System.out.println("--- Simple Method ---");
        testmethod();
        
        System.out.println("\n--- Parameterized Method ---");
        demomethod("Akshay", 24);
        demomethod("Arjun", 17);
        demomethod("Rahul", 24);
        
        System.out.println("\n--- Method Overloading Examples ---");
        
        // For void method - call it separately (can't put inside println)
        System.out.print("Adding 2 integers (10 + 20): ");
        add(10, 20);  // This prints the result
        
        // These return values so they can be in println
        System.out.println("Adding 3 integers (10 + 20 + 30): " + add(10, 20, 30));
        System.out.println("Adding 2 doubles (10.5 + 20.7): " + add(10.5, 20.7));
        System.out.println("Concatenating strings ('Hello' + 'World'): " + add("Hello", "World"));

        // Java Recursion 
        System.out.println("\n--- Recursion Example ---");
        recursion(5);
        
        System.out.println("\n--- Factorial Examples ---");
        System.out.println("Factorial of 5 (iterative): " + fact(5));
        System.out.println("Factorial of 5 (recursive): " + factRecursive(5));
    }
}