public class Interfaces {
    public static void main(String[] args) {
        
        System.out.println("Interface In Java");
        
        // Interface is the blueprint of a class.
        // allow abstarct , static , default methods 
        // before java 8, In Inteface, only abstarct method and concrete method is allow 

        //  extends and implements in Interface
        //  extends : for classes and interfaces inheriting from a class or interface.
        //  extends : class A extends B { };  OR interface A extends B, C { };
        //  implements : for a class adopting an interface can single or muliple

        Dog obj = new Dog();

        obj.sound();
        obj.describe();


    }
}

/**
 * Interfaces
 */
 interface Animal {

    public String Name = "Animal";

    // Constants (implicitly public static final)
    int MAX_SIZE = 100;
    String URL = "https://api.com";   // constant

    void sound();   // abstract method - does not have body ..

    static void describe() {     // static method - belong to the class , Cannot be Override !
        System.out.println("There are Many Animals, Cats , Dogs ");
    }

    default boolean isAnimal() {   // default method - has body, can be Overide !
        return true;
    }

    // private method java 9
    private void privateMthod() {
        System.out.println("This is Private Method in Interfaces");
    }
}


 class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dogs barks !");
    }
    
    static void describe() {
        System.out.println("Dogs has 20 Years To Live !");
    }

 
}

// Diamond Problem — Solved by Interfaces

interface Fly { default void move(){ System.out.println("Fly"); } }
interface Swim { default void move(){ System.out.println("Swim"); } }

class Duck implements Fly, Swim {
    @Override public void move() {
        Fly.super.move();   // explicitly choose
        Swim.super.move();
    }
}

// Class inheritance has no diamond issue because Java allows only single class inheritance.





// Why No Multiple Inheritance with Classes?
// Diamond problem:

// java
// class A { void show() { System.out.println("A"); } }
// class B extends A { void show() { System.out.println("B"); } }
// class C extends A { void show() { System.out.println("C"); } }
// class D extends B, C { }   // ❌ which show() to inherit?
// Java avoids this ambiguity by allowing only single class inheritance. Interfaces solve it with default + explicit Interface.super.method():

// java
// interface B { default void show(){ System.out.println("B"); } }
// interface C { default void show(){ System.out.println("C"); } }

// class D implements B, C {
//     @Override public void show() {
//         B.super.show();   // explicitly pick one
//     }
// }