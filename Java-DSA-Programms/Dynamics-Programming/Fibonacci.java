import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {

        System.out.println("Fibonacci Programm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Print Fibonacci : ");

        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i <= num;i++) {
            System.out.println("fibonacci :" + a);
            int next = a + b;
            a = b;
            b = next;

        }


    }
}
