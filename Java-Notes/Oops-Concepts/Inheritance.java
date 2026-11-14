

public class Inheritance implements D {
    public static void main(String[] args) {
        
        System.out.println("Inheritance In Java");

        // Inheritance In java is One class can Inherit / Access properties and methods of Another Class...

        // Types of Inheritance :-
        // Single - child extends parents or vice versa
        // Multi-Level - GrandParents > Parents > Child
        // Multiple - Only archive through Interfaces - Solve Diamond Problem
        // Hierarchical - One Parents -> Multiple childs
        // Hybrid - Combination of two or more types — e.g., multilevel + hierarchical via interfaces.
        

        // SIngle Inheritance
        System.out.println("Single Inheritance : ");
        Dog obj = new Dog();
        obj.describe(); // calls inherit
        obj.dog(); // calls own methods too



        // Multi-Level 
        System.out.println("Multi-Level Inheritance : ");
        Child child = new Child();
        child.grandparent();
        child.parents();
        child.child();

        // Multiple Inheritance
        System.out.println("Multiple Inheritance : ");
        D.d();


        // Hierarchical  - One parent -> Multiple childs 
        System.out.println("Hierarchical Inheritance : ");
        Dogs dogs = new Dogs();
        dogs.sound();
        Cat cat = new Cat();
        cat.sound();
        


        // Hybrid Inheritance  - Cobination of two or more inheritance types - multilevel + hierarchical via interfaces.
        System.out.println("Hybrid Inheritance : ");
        Dolphin d = new Dolphin();

        d.eat();       // inherited from Animal     (multilevel)
        d.breathe();   // inherited from Mammal     (multilevel)
        d.swim();      // implemented from Swimmable (multiple)
        d.walk();      // implemented from Walkable  (multiple)




    }
}

// Single Inhertance

class Animal {
    String Name = "Animal";
    void describe() {
        System.out.println("This is Animal Method");
    }
}
class Dog extends Animal { 
    void dog() {
        super.describe();     // Calls Parents Methods, fields ,and default constructor super();
        System.out.println("This is Dog Method");
        System.out.println(super.Name);  // call via super keyword
    }
}

// Mutli-Level Inheritance

class GrandParents {
    void grandparent() {
        System.out.println("This is GrandParents Class");
    }
}
class Parents extends GrandParents {
    void parents() {
        System.out.println("This is Parents Class");
    }
}
class Child extends Parents {            // child class can access all above class properties and fields
    void child() {
        System.out.println("This is Child Class");
    }
}


// Multiple Inheritance - One Interface extends Multiple Interfaces

interface A {
    static void a() {
        System.out.println("This is Method A, Multiple Inheritance");
    }
}
interface B {
    static void b() {
        System.out.println("This is Method B");
    }
}
interface C {
    static void c() {
        System.out.println("This is Method C");
    }
}

interface D extends A, B, C {
    static void d() {
        System.out.println("This is Method D");
        A.a();
        B.b();
        C.c();
    }
}

// Hierarchical - One Parents -> Multiple childs  - Both child access their Parents properties and fields

class Animals {
    void sound() {
        System.out.println("This is Animal Method in Hierarchical");
    }
}

class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

 // Hybrid Inheritance  - Cobination of two or more inheritance types - multilevel + hierarchical via interfaces.

 // --- Level 1: single inheritance (class → class) ---
class Animalss {
    void eat() { System.out.println("Animal eats"); }
}

// --- Level 2: multilevel inheritance (class → class) ---
class Mammal extends Animalss {
    void breathe() { System.out.println("Mammal breathes"); }
}

// --- Multiple inheritance contracts (interfaces) ---
interface Swimmable {
    void swim();
}
interface Walkable {
    void walk();
}

// --- Hybrid: extends ONE class + implements MULTIPLE interfaces --- single + multiple inheritance 
class Dolphin extends Mammal implements Swimmable, Walkable {
    public void swim() { System.out.println("Dolphin swims"); }
    public void walk() { System.out.println("Dolphin walks (on land)"); }
}

