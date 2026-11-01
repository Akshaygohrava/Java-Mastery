import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println("Check For Prime Numbers : ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Prime or Not : ");

        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The Number " + num + " is Prime !");
        } else {
            System.out.println("The Number is Not Prime !");
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
