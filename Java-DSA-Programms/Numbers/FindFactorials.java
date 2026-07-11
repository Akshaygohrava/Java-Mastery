import java.util.*;
import java.util.Scanner;
public class FindFactorials {
    public static void main(String[] args) {
        
        System.out.println("Find Factorial Number of N !");

        System.out.println("Enter Number To Find Factorial : ");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        
        int factorial = 1;
        for(int i = input; i >= 1; i--) {
            factorial = factorial * i;
        }
        
        System.out.println("Factorial of " + input + " is " + factorial);
    }
}