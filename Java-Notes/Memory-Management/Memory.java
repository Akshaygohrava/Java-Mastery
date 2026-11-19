
public class Memory {
    public static void main(String[] args) {
        
        System.out.println("Memory Management In Java");

        // Understanding Java memory is the key to writing fast, safe programs. Let's build it up piece by piece.

        // When a Java program runs, the JVM divides memory into two big regions: Stack and Heap 


    }
}

// Garbage Collection in Java
// Garbage Collection (GC) is Java's automatic memory management mechanism that reclaims memory occupied by objects, 
// that are no longer in use by the program. It frees developers from manually allocating and deallocating memory (unlike C/C++).

// Stack is a region of memory that stores methods execution states , local primitives , reference And 
// The stack cleans itself up automatically. No garbage collector needed for stack memory. 
// (Uses JVM to Clean automatically ...)

// The heap is the large, shared memory region where all objects and arrays live. Unlike the stack, 
// it has no automatic push/pop cleanup — it relies entirely on the Garbage Collector (GC) to reclaim memory.
// Shared by all threads in the JVM 
// Stores all objects created with new, String objects and the String Pool
// Divided into Young Generation (Eden + Survivors) and Old Generation — the home of garbage collection
// Objects stay alive as long as they're reachable

// Stack = fast, small, per-thread, automatic, holds references and primitives.
// Heap = large, shared, GC-managed, holds actual objects.
// A reference sits on the stack and points to an object on the heap.

// The String Pool (also called the String Constant Pool or String Intern Pool) is a special region inside the heap, 
// where Java stores string literals so that identical string values are shared and reused instead of duplicated.
// It's essentially a cache of unique String objects.


//            Stack Memory                                   Heap Memory 

//        Each Thread has its own                    shared across all threads 
//      Stores local variables, methods frames       Objects , Arrays , String pool , class metadata
//         Small in Size 512kb - 1MB                          Large
//           Very Fast In Speed                               Slower
//       Automatic cleanup when method returns         Garbage Collector 
//           Until method exits                      Until GC finds unreachable
//          StackOverFlowError                           OutOfMemoryError 

// The heap is a shared, dynamic memory region for objects and arrays, managed by the Garbage Collector. 
// Unlike the stack, it cleans up non-deterministically — objects are freed only when unreachable and 
// only when GC runs. Stack = automatic & instant; Heap = GC-managed & eventual.
