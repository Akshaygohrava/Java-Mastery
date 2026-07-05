import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
      
        String text = "MOM";

        System.out.println(text);

        String reverse = new StringBuilder(text).reverse().toString();

        if (reverse.equals(text)) {
            System.out.println("The Text "+ text +" is Palindrome");
        } else {
            System.out.println("The Text "+ text +" is Not Palindrome");
        }
    


        

    }
}
