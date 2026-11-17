public class Polymorphism {
    public static void main(String[] args) {
        
        System.out.println("Polymorphism In Java");

        // Polymprphim Is One Object , Many Forms
        // Polymorphism = "many forms" — one interface, many implementations.
        // Two Types of Polymorphism --Compile-time (static) Polymorphism and Runtime (dynamic) Polymorphism
        // Compile-time is Method Overloading - Same Method Name, One Or Many different types of parameter
        // Run-time is Method Overriding  - Same Method Name, Same Parameter , Different Implementation of Sub-Classes


        // Method OverLoading
        System.out.println("Method Overloading :");
        Calculator c = new Calculator();
        c.add(2, 3);           // int,int → 5
        c.add(2, 3, 4);        // int,int,int → 9
        c.add(2.5, 3.5);       // double,double → 6.0
        c.add("Hi", "There");  // String,String → "HiThere"

        // Compiler picks the method based on the argument types at compile time. No runtime lookup.


        // Method Overriding 
        System.out.println("Method Overriding :");
        Dog obj = new Dog();
        obj.sound();

        Cat cat = new Cat();
        cat.sound();


    }
}
// Method OverLoading
class Calculator {
    void add(int a, int b)   {  System.out.println( a + b);  }
    void add(int a, int b, int c)   { System.out.println( a + b + c); }
    void add(double a, double b) { System.out.println(a + b); }
    void add(String a, String b) { System.out.println(a + b); }
}


// Method Overiding - SImilar Example of Hirariecle Inheritance 
class Animal {
    void sound() {
        System.out.println("Animals Sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs Barks !");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cats Meows !");
    }
}