import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime Number Check Program !");

        // What is a Prime Number?
// A Prime Number is a natural number greater than 1 that has exactly two factors: 1 and itself.
// A prime number is a number that can only be divided evenly by 1 and itself.



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
