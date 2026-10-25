import java.util.Scanner;

public class NumberProgramsPractices {
    public static void main(String[] args) {
        System.out.println("Number Programms Practing !");

        // I hHave to Remember the logic Behind Every pProblem , Not Whole Code !
        // e.g num % i == 0 for prime number check , Where num = given input, and i = iterate from 2 - given input = num 



        // Prime Number

        Scanner sc = new Scanner(System.in);

        int fact = sc.nextInt();

        if (isprime(fact)) {
            System.out.println("The Number " + fact + " is a Prime Number !");
        } else {
            System.out.println("The Number " + fact + " is Not a Prime Number !");
        }
    

       

    }


    public static boolean isprime(int fact) {
            if (fact <= 1) {
                return  false;
            }

            for(int i = 2; i < fact; i++) {
                if (fact % i == 0) {
                    return false;
                }
            }
            return true;
       }
}
