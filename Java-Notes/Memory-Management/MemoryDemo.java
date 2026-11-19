public class MemoryDemo {

    // ── Static variable → lives in Method Area/Metaspace (reachable via GC root) ──
    static String staticStr = "static-literal";

    // ── Instance field → lives on HEAP inside each object ──
    int instancePrimitive = 99;          // primitive field → on HEAP (inside object)
    String instanceRef;                  // reference field → on HEAP, points to String

    public static void main(String[] args) {

        System.out.println("========== 1. STACK vs HEAP ==========");
        // 'a' is a local primitive → STACK
        // 'p' is a local reference   → STACK, points to object on HEAP
        int a = 10;
        Person p = new Person("Alice", 30);
        //  - reference 'p'        → STACK
        //  - Person object        → HEAP
        //  - "Alice" literal      → STRING POOL (inside heap)
        //  - age (primitive 30)   → HEAP (inside Person object)

        System.out.println("a = " + a);
        System.out.println("p = " + p);


        System.out.println("\n========== 2. STRING POOL & == vs equals ==========");
        // Literals → automatically pooled. Both point to the SAME object.
        String s1 = "hello";
        String s2 = "hello";

        // new String → creates a NEW object on the heap, OUTSIDE the pool
        String s3 = new String("hello");

        // intern() → returns the pooled instance
        String s4 = s3.intern();

        System.out.println("s1 == s2      : " + (s1 == s2));       // true  (same pooled object)
        System.out.println("s1 == s3      : " + (s1 == s3));       // false (different objects)
        System.out.println("s1.equals(s3) : " + s1.equals(s3));    // true  (same content)
        System.out.println("s1 == s4      : " + (s1 == s4));       // true  (intern() → pooled)
        System.out.println("s3 == s4      : " + (s3 == s4));       // false (s3 is heap object)


        System.out.println("\n========== 3. REFERENCE COPYING ==========");
        Person p2 = p;              // copies the REFERENCE, not the object
        p2.name = "Bob";            // modifies the SAME heap object
        System.out.println("p.name  = " + p.name);   // Bob  (same object!)
        System.out.println("p2.name = " + p2.name);  // Bob
        System.out.println("p == p2 : " + (p == p2)); // true (same reference)


        System.out.println("\n========== 4. SETTING REFERENCE TO NULL ==========");
        Person temp = new Person("Temp", 1);
        System.out.println("before null: " + temp.name);
        temp = null;   // object now UNREACHABLE → eligible for GC
        // The OBJECT is still on heap until GC runs; we just lost the handle.
        // System.out.println(temp.name);  // ❌ NullPointerException


        System.out.println("\n========== 5. OBJECTS WITH EQUAL CONTENT BUT DIFFERENT IDENTITY ==========");
        Person x = new Person("Same", 25);
        Person y = new Person("Same", 25);

        System.out.println("x == y        : " + (x == y));         // false (different objects)
        System.out.println("x.equals(y)   : " + x.equals(y));      // true  (Person.equals overridden)
        System.out.println("x.name == y.name : " + (x.name == y.name)); // true! both "Same" literals → pooled


        System.out.println("\n========== 6. STRING CONCATENATION (NOT pooled) ==========");
        String part1 = "hel";
        String part2 = "lo";
        String combined = part1 + part2;      // computed at runtime → NEW heap object
        System.out.println("combined == \"hello\"     : " + (combined == "hello"));     // false
        System.out.println("combined.equals(\"hello\") : " + combined.equals("hello"));  // true
    }
}


// ── Simple class to demonstrate object layout on the heap ──
class Person {
    String name;     // reference field → HEAP (points to String, often in pool)
    int age;         // primitive field → HEAP (inside the object)

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return age == other.age && name.equals(other.name);  // content comparison
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}