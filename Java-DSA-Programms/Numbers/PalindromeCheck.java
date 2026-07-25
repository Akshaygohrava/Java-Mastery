import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String arg[]) {
        System.out.println("Palindrome Numbers Check ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Number Palindrome : ");
        int num = sc.nextInt();

        String str = Integer.toString(num);
        String reverseText = new StringBuilder(str).reverse().toString();
        int nums = Integer.parseInt(reverseText);

        if (num == nums) {
            System.out.println("The Number " + num + " is Palindrome");
        } else {
            System.out.println("The Number " + num + " is Not Palindrome");
        }
        System.out.println(num == nums);


    }
}