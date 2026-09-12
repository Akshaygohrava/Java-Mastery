import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
    
        // To Mastering Java, Keep Practising New Programs, new Projects ,
        // Already Done programms and project here... like Calculator , Find Factorial ects ...
       
        System.out.println("This is Java Practice Arena !");

        int[] num = {45, 54, 67, 45, 66, 54, 67, 32};

        for(int a : num) {
             System.out.print(a);
        }
       System.out.println("Length Arrays : " + num.length);

        HashSet<Integer> nums = new HashSet<Integer>();

        for(int a : num) {
            //   System.out.println(a);
            nums.add(a);
        }
       System.out.println("Unique Arrays : " + nums);
       System.out.println("Length Arrays : " + nums.size());



       System.out.println("Testing String :");


    


     





    }
}