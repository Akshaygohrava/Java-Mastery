
public class CoreJava2 {
    // Access Modifiers
    int a = 1;       // default → same package
    public int b = 2;          // everywhere
    private int c = 3;    // only inside CoreJava2
    protected int d = 4;       // package + subclasses

    // Non Access Modifiers
    
    String name = "Akshay Gohrava"; // Non-static
    static int age = 25;  // static

    static void staticmethod() {
           System.out.println("This is a static method");
    }
    void nonstaticmethod() {
        System.out.println("This is Non static method");
    }


    final String address = "Wadala";

    final void finalmethod() {
        System.out.println("This is FInal Method , Which cannot be overide !");
    }
    class test extends CoreJava2 {
        @Override 
        void  nonstaticmethod() {
        System.out.println("This is Overiding the method !");
          }
        
        //   @Override 
        //   void finalmethod() {       // giving error , cannot overide final method 

        //   }
    }



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

        System.out.println(obj.name); // non-staic variable,  need to create object , to access non static
        System.out.println(age);  // static variable, direct access , static variable and methods 

        staticmethod();   // static method

        obj.nonstaticmethod();  // non-static method

        System.out.println(obj.a + obj.b + obj.c + obj.d);
        
    }
}
