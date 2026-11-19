public class MemoryManagement {
    public static void main(String[] args) {
        
        System.out.println("Memory Management In Java !");

        String a = "Akshay";                  // pooled object -> a stores in stack , "Akshay" points to String pool
        String b = new String("Akshay");      // new heap object (+ pooled literal) -> b stores in Heap , "Akshay" to String pool
        String c = "Akshay";

        System.out.println(a == b);           // false → new creates different objects
        System.out.println(a.equals(b));      // true  → same content
        System.out.println(a == b.intern());  // true  → intern() returns pooled instance
        System.out.println(a == c);           // true  → same String pool
        System.out.println(a.equals(c));      // true  → same content

    }
}
