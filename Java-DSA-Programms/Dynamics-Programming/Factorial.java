import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        System.out.println("Factorial Of N ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Find Factorial : ");

        int fact = sc.nextInt();

        int factorial = 1;

        for(int i = fact; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial of " + fact + " is " + factorial);


    }
}
