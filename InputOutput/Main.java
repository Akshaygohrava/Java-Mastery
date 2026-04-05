import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, This is Input / Output Designed By Akshay Gohrava");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int Age = sc.nextInt();

        System.out.println("Hello " + Name + " Your Age is " + Age );

        sc.close();

    }
}