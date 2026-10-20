import java.util.Scanner;

public class TableOfN {
    public static void main(String args[]) {

        System.out.println("Table Of Any Given Number !");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to Print the Table :");

        int num = sc.nextInt();

        System.out.println("Table of " + num);
        for(int i = 1;i <= 10;i++) {
             System.out.println(num + " * " + i + " = " + i*num);
        }

    }
}