public class MyRunnable {
    public static void main(String[] args) {
        
        System.out.println("MulitThreading : Implements Runnable");

        // Thread t = new Thread(new MyTask(), "T1 Worker");
        // t.start();

        MyTask task = new MyTask();  // task = just the job 
        
        Thread t = new Thread(task);   // wrap it in a thread

        t.start();


    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Running in " + Thread.currentThread().getName());
    }
    
}


// Runnable.run() returns void and can't throw checked exceptions.
// Callable.call() returns a value and can throw.

// Race condition = multiple threads reading/writing shared data → corrupted results.

// Deadlock — The Classic Trap 
// Two threads each hold a lock the other wants → both wait forever.



// Differece Between Thread Class and Runnable Interface 
//        Thread Class                    Runnable Interface 
//        extends Thread                    implements runnable
//     The thread itself (the worker)          The task (the work to do)
//      single inherit                     multiple inherit 

// Thread = the worker.
// Runnable = the job the worker does.