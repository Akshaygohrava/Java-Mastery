

public class MultiThreading extends Thread {

    @Override
    public void run() {
        for(int i = 1;i <=3;i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        System.out.println("Hello from inside MyThread");
    }
    public static void main(String[] args) {

        System.out.println("MultiThreading In Java !");

        // Multithreading = running multiple tasks concurrently inside one program. Each task runs in its own 
        // Thread — a lightweight unit of execution sharing the same memory.
        //  What Is a Thread?
        // A thread is the smallest unit of execution. A Java program starts with one thread (main). You can create more.


        System.out.println(Thread.currentThread().getName());   // main

         MultiThreading t1 = new MultiThreading();

        t1.setName("T1");

        t1.start(); // ✅ starts a NEW thread  // // JVM calls run() on a NEW thread
        // t1.run(); //  ❌ runs on main thread — NOT a new thread   // // just a normal method call on the MAIN thread

        System.out.println("Hello from main");

        // ⚠️ Always call start(), never run() directly. start() creates a new OS thread; run() is just a normal method call.

        


        
    }
}


//  Why multithreading?
// Use multiple CPU cores
// Keep UI responsive while doing background work
// Handle many clients (servers)
// Do I/O while computing

// Analogy:
// Process = a restaurant (own memory)
// Thread = waiters inside it (share the kitchen/memory)