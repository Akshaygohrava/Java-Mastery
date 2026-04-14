import java.util.Scanner;

public class Javacheatsheet {
    public static void main(String[] args) {
        System.out.println("Hello, Java CheatSheet !");
        
        // Data Types

        String Name = "Akshay Gohrava";
        int Age = 24;
        float Weight = 85.99f;
        double Height = 7.33d;
        char Grade = 'A';

        var Name2 = "Allen";
        var age = 23;
        
        final var hello = "Akshay";
        System.out.println("My Name Is : " + Name);


        for(int i = 0; i < 3; i++) {
            System.out.println(i + Age);
        }
       
       int a = 5;
       double b = 8.45;
       System.out.println(a + b);
       System.err.println(a == b);
       System.out.println("This is String1 "  +  hello);

      // Taking User Input 
      Scanner obj = new Scanner(System.in);  // creating Scanner Object

      System.out.println("Enter Your UserName: ");

      String input = obj.nextLine();  // Taking Input 

      System.out.println("UserName is :" + input);  // Printing Output 

    //  if else statements && Logical operator , AND && , OR || , NOT !

    int AGE = 19;
    boolean isLogin = true;
    if(AGE < 18) {
        System.out.println("You are not Eligible to vote !");
    }
    else if(AGE > 18 && isLogin) {
        System.out.println("You are Eligible to Vote !");
    }
    else {
        System.out.println("You will Eligible Soon");
    }



   // String and its Methods

   String name = "Akshay Gohrava";
  
   String Name3 = name.toUpperCase();
   char Name4 = name.charAt(3);
   int Name5 = name.length();

   System.out.println(Name3 + " " + Name4 + "The Lenght of Stirng is " + Name5);


  //  Nested If else
   boolean morning = true;
   boolean night = false;
   boolean evening = false;
   if(morning) {
        if(evening) {
            System.out.println("Good Moring Friends !");
        }
        else {
            System.out.println("Good Evening Friends");
        }
   }
   else {
       System.out.println("Good Night Friends !");
    }

    //   Switch in Java

     String day = "wednesday";
     switch(day) {
       case "monday":
       System.out.println("Today is Monday");
       break;
       case "tuesday":
       System.out.println("Today is tuesday");
       break;
       case "wednesday":
       System.out.println("Today is wednesday");
       break;
       case "thrusday":
       System.out.println("Today is thrusday");
       break;
       case "friday":
       System.out.println("Today is friday");
       break;
       default:
        System.out.println("Weekend Is Going On !");
     }

   int test = 1;
   while (test < 3) { 
       System.out.println("Hello" + test);
       test++;
   }

   do {
        System.out.println("hwllo, This is Do While Loop !");
   }while (test < 2);


                /*  Arrays in Java !  */


   String[] names = {"Akshay", "Rahul", "Deepesh","Nishant"};
   System.out.println("My Name is " + names[0] + "Gohrava " + "My Friends is " + names[1] + " " + names[2] );
   System.out.println(names[3]);

//    Two Dimensions Arrays 

    String[][] data = {{"Akshay", "Deepes"},{"Rahul","Mandar"}};
    System.out.println(data[0][0]);   //Akshay
    System.out.println(data[1][1]);   //Mandar













    }

} 