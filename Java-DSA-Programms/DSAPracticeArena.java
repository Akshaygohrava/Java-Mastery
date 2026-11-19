import java.util.Scanner;

public class DSAPracticeArena {
    public static void main(String[] args) {
        
        System.out.println("DSA Practice Arena !");

        // Dynamic Programming All DSA - fibonacci - factorial - isPrime - starPattern

     
        int input = 5;

        int fact = 1;

        for(int i = input; i >= 1; i--) {
            fact *= i;
        }

        System.out.println("Factorial of " + input + " is " + fact);


        int a = 0;
        int b = 1;

        for(int i = 0; i <= 10;i++) {

            int next = a + b;
            a = b;
            b = next;
            System.out.println("fibonacci : " + a);
        }
        

        int num = 7;

        if (isPrime(num)) {
            System.out.println("The Number " + num + " is Prime !");
        } else {
            System.out.println("The Number is Not Prime !");
        }

        for(int i = 1; i <= 3;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


      
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
         return true;
    }

}
