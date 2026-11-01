
public class CoreJava {

    String name = "Akshay Gohrava";  // non-static variable
    static int age = 25;        // static variable

    // Constructor
    CoreJava() {
            System.out.println("Hello I M Constructor Method In Java");
        }
        // Parameterized Constructor
    CoreJava(String name, int marks) {
        System.out.println(name + " " + marks);
    }
    public static void main(String[] args) {
        
        System.out.println("Core Java Revision");

        // Class - Object - Constructor - static vs non-static variables, methods

        // Class is a blueprint , which creates the programm structure, including methods , variables, and logic
        // Object is Instance of a Class
        // Constructor is a default method of a class, automatically called when Class Object is Created .
        // Static belongs to the class, every static varibles, methods can be called without creating class object.

        CoreJava obj = new CoreJava();    // Creating Object of Class CoreJava !

        System.out.println("My Name is " + obj.name);   // calling non-static variable through class pbject

        System.out.println("I M " + age + " Year Old !");


        // Can Create Multiple Object of the One Class
        // One class → many objects.
        CoreJava student1 = new CoreJava("vivek", 58);
        CoreJava student2 = new CoreJava("deepesh", 73);
        CoreJava student3 = new CoreJava("rahul", 66);

        System.out.println(student1.name);


    }
}
