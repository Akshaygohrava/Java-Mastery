

//  Java Classes and Objects

public class JavaOOPS {
     
     String name = "Akshay Gohrava";

    //  Method
        void demomethod() {
        System.out.println("This is a Demo , Methods");
       }  

     public static void main(String[] args) {
        //  Creating Above Class Object , So WE can Access Them.

        JavaOOPS obj = new JavaOOPS();

        System.out.println(obj.name);   // Output : Akshay Gohrava
        // Method Accessing ....
        
        obj.demomethod();

        // Modifying ....
           obj.name = "Akshay Bhuva";

           System.out.println(obj.name);







     }


}








