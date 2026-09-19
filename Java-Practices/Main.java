import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
    
        // To Mastering Java, Keep Practising New Programs, new Projects ,
        // Already Done programms and project here... like Calculator , Find Factorial ects ...
       
        System.out.println("This is Java Practice Arena !");

        int[] num = {45, 54, 67, 45, 66, 54, 67, 32};

        int max = num[0];

        for(int i = 0; i < num.length;i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);

     





    }
}