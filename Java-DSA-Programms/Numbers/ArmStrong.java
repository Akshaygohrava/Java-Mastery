import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        // A number is Armstrong if: Number = Sum of (each digit ^ total number of digits)
        
          System.out.println("Solving ArmSromg Number DSA");

          Scanner arm = new Scanner(System.in);

          System.out.println("Enter Number To Check ArmStrong : ");
          int input = arm.nextInt();

          int original = input;

          String numStr = String.valueOf(input);

          int numofdigit = numStr.length();

          int sum = 0;

          for(int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += (int) Math.pow(digit, numofdigit);
          }

          if (sum == original) {
              System.out.println("The Number " + input + " is ArmStrong Number !");
          } else {
              System.out.println("The Number " + input + " is Not ArmStrong Number !");
          }




        

          


    }
    
}
