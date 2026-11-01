import java.util.Scanner;

public class DSAPracticeArena {
    public static void main(String[] args) {
        
        System.out.println("DSA Practice Arena !");


        int a = 0;
        int b = 1;

        for(int i = 0; i <= 10; i++) {
            System.out.println("fibonacci :" + a);

            int next = a + b;
            a = b;
            b = next;


        }



        int input = 5;

        int fact = 1;

        for(int i = input; i > 1; i--) {
            fact *= i;
        }

        System.out.println("Factorial of " + input + " is :" + fact);


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to Check Prime : ");

        int num = sc.nextInt();

        if (isprime(num)) {
            System.out.println("The Number " + num + " is Prime !");
        } else {
            System.out.println("The Number " + num + " is not Prime !");
        }



    }
    public static boolean isprime(int num) {
        for(int i = 2; i < num; i++) {
            if (num <= 1) {
                return false;
            }
            if (num % i == 0) {
                return false;
            } 
        }
         return true;
    }
}
