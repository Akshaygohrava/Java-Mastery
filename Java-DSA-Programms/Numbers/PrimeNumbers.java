import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime Number Check Program !");

        // What is a Prime Number?
// A Prime Number is a natural number greater than 1 that has exactly two factors: 1 and itself.
// A prime number is a number that can only be divided evenly by 1 and itself.

// What is a prime number?
// A prime is a number greater than 1 that can only be divided evenly by 1 and itself.
// Examples: 2, 3, 5, 7, 11... (4 is not prime because 4 ÷ 2 = 2)
// "Try dividing the number by everything from 2 to one less than itself. If anything divides it evenly, it's not prime. If nothing does, it's prime."



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Prime Number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The Number " + num + " Is Prime !");
        } else {
            System.out.println("The Number " + num + " Is Not Prime !");
        }





    }
     
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for(int i = 2; i < num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
