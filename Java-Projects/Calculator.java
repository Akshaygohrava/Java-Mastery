import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        System.out.println("Hello, This is Calculator Based On Java ,By Akshay-Gohrava");

        System.out.println("==============================");
        System.out.println("Welcome to Java Calculator");
        System.out.println("==============================");
        
        Scanner cal = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int input1 = cal.nextInt();

        System.out.println("Enter Number 2 : ");
        int input2 = cal.nextInt();
        
        System.out.println("Select An Operator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int chioce = cal.nextInt();
         

        switch (chioce) {
            case 1:
                int resultadd = input1 + input2;
                System.out.println("Addition Of " + input1 + " and " + input2 + " is : " + resultadd);
                break;

            case 2:
                int resultsub = input1 - input2;
                System.out.println("Substraction Of " + input1 + " and " + input2 + " is : " + resultsub);
                break;

            case 3:
                int resultmulti = input1 * input2;
                System.out.println("Multiplication Of " + input1 + " and " + input2 + " is : " + resultmulti);
                break;

            case 4:
                int resultdiv = input1 / input2;
                System.out.println("Division Of " + input1 + " and " + input2 + " is : " + resultdiv);
                break;
        
            default:
                break;
        }
        
        


    }
 }


 