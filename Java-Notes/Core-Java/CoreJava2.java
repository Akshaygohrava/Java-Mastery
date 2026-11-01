
public class CoreJava2 {
    // Access Modifiers
    int a = 1;       // default → same package
    public int b = 2;          // everywhere
    private int c = 3;    // only inside Demo
    protected int d = 4;       // package + subclasses

    // Non Access Modifiers
    
    String name = "Akshay Gohrava"; // Non-static
    static int age = 25;  // static

    static String test() {

    }

    final String address = "Wadala";


    public static void main(String[] args) {

        System.out.println("Core Java Notes - 2");

        System.out.println("Access/Non Access Modifiers");

        // Access Modifiers => default, public, private, protexted
        // Non-Acces Modifiers => static, final, abstract, synchronized

        // Static belongs to the class, every static varibles, methods can be called without creating class object.

        // final Means "cannot change":
        // final variable → constant (value can't change)
        // final method → can't be overridden
        // final class → can't be extended (e.g., String)


        CoreJava2 obj = new CoreJava2();

        System.out.println(obj.name); // need to create object , to access non static
        System.out.println(age);  // direct access , static variable and methods 


        
    }
}
