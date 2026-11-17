

public class Exceptions {
    public static void main(String[] args) {
        
        System.out.println("Exceptions In Java !");

        // Exception is an event occurs , stop the normal execution flow of Programm
        // Two Types of Exception , Compile-time and Run-time Exception
        // Compile-time is checked Exception and Run-time is uncheck Exception
        // compile-time Exception occurs at compiling the program
        // Run-time Exception occurs at executing the program , it compiles , but throw errors 


        int result = 10 / 0;  // ArithmeticException , cannot devide by zero
        System.out.println(result);   // never reached 

        int[] marks = {34, 56, 22, 78, 44, 61, 47, 88}; 
        System.out.println(marks[0]);    // this will also not print , beacuse of above error 

        System.out.println(marks[8]);    // ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8




        //           Compile-time Exception                      Run-time Exception
        
        //             Checked                                       UnChecked
        //           Created at compile-time                     Created at run-time
        //           Must Handle                                  UnChecked , Optional
        //         IOException, SQLException                       NullPointer , ArithmeticException
        //          FileNotFoundException                           ArrayIndexOutOfBoundsException

        // Revision Flow: Exception - ExceptionHAndling 1,2 - Throw,Throws - BankApp Example
    }
}
