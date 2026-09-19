import java.util.Scanner;

public class NumberProgramsPractices {
    public static void main(String[] args) {
        System.out.println("Number Programms Practing !");



        // Prime Number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check if number is prime : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The Number is Prime !");
        } else {
            System.out.println("The Number is Not Prime !");
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
