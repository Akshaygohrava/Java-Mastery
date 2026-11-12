
public class Abstraction {
    public static void main(String[] args) {
        
        System.out.println("Abstraction In Java Object Oriented Programming");

        // Abstraction is hide complex implementation and Show Only Essesntial Features to the users .
        // e.g A car has steering wheel, brakes, meter, but not showing Car engine, motors, brake mechanisms ect
        // Abstarction arcihve by abstract class and interfaces


        Dog dog = new Dog();

        dog.sound();  // calling abstract method

        dog.describe();  // calling concrete method 

        // Animal shape = new Animal();  // Cannot Create Object of Abstarct Class, abstarction ...


        //     Abstarct Class                        Interface
        //    have constructor                      No Constructor
        //    single inheritance                    multiple inheritance
        //    concert + abstract method             default, static ,private, abstract
        //     all modifiers                        public , private


    }
}

abstract class Animal {

    protected String color;          // accessible in subclasses
    private int version = 1;         // hidden
    static int totalShapes = 0;      // shared
    final String TYPE = "dog";     // constant

    String name;  // instance variables

    abstract void sound(); // abstarct method, no body

    void describe() {     // concrete method, has body 
        System.out.println("This is Concrete method , has body and itherit it");
    }

    // constructor - default method of class, called automatically when class object is created 
    Animal() {
        System.out.println("Hello, I m Abstact class Constructor");
    }
}
class Dog extends Animal {
    double radius;

    @Override
    void describe() {
        System.out.println("Hello, I M Concrete Method from Dog Class !");
    }

    @Override
    void sound() {
        System.out.println("Hello, I M Abstarct Method !");
        System.out.println("Dog barks");
    }

    String name = "Dogesh Bhai";
}

