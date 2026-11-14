 import java.util.Optional;
 
 public class Classes {
    public static void main(String[] args) {
        
        System.out.println("Class and Classes In Java !");

        // Class is a blueprint , which hold program structure ... 
        // Object is a intance of a class
        // Constructor - is the default methods in Java , which automatically calls when class object is created !

        // void - which does not return anything 

        // Types of Classes In JAVA
        // Wrapper classes wrap a primitive into an object. Needed because generics/collections can't hold primitives.
        // An immutable class can't be changed after creation. All fields final, no setters, defensive copies.
        // Optional<T> is a container that either holds a value or is empty. Replaces null for "may be absent" values.


        // Methods in Java - static , final , private Methods cannot be Override 
        // use void methodName() { };  or boolean isValid() { };
        // Method can be Overload or Override 



    }
}



 class SchoolDemo {

    // ✅ IMMUTABLE class — can't change after creation
    static final class Student {
        private final int id;
        private final String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId()     { return id; }
        public String getName() { return name; }
    }

    // Simulated "database"
    static Student[] students = {
        new Student(1, "Alice"),
        new Student(2, "Bob")
    };

    // ✅ OPTIONAL — return type that says "may not find"
    static Optional<Student> findStudent(Integer id) {   // ✅ WRAPPER: Integer
        if (id == null) return Optional.empty();
        for (Student s : students) {
            if (s.getId() == id) return Optional.of(s);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        // ✅ WRAPPER: primitive 1 auto-boxed to Integer
        Integer searchId = 1;

        // ✅ OPTIONAL: safe lookup
        Optional<Student> result = findStudent(searchId);

        // ✅ IMMUTABLE: student object can't be modified
        String name = result.map(Student::getName).orElse("Unknown");

        System.out.println(name);        // Alice

        // Try a missing student
        System.out.println(
            findStudent(99).map(Student::getName).orElse("Unknown")
        );                               // Unknown
    }
}


// Quick Summary
// Concept	What it is	Simple rule
// Wrapper	Object version of a primitive	Use .equals(), not ==
// Immutable	Can't change after creation	final fields, no setters, return new object
// Optional	Box that may hold a value or be empty	Return it from methods that may find nothing