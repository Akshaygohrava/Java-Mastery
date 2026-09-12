import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
            System.out.println("Reverse An String Programme");

            String text = "Akshay Gohrava";

            StringBuilder rev = new StringBuilder(text).reverse();

            System.out.println("Reverse a String using method(): " + rev);

            // Reverse a String With Method

            String name = "Akshay Gohrava";

            String reverse = "";

            for(int i = name.length() - 1; i >= 0; i--){
                reverse += name.charAt(i);
            }

            System.out.println("Reverse String without method: " +reverse);
            
        
    }
}
