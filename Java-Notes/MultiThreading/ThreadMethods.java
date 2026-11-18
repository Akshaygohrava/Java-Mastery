public class ThreadMethods {
    public static void main(String[] args) {
        
        System.out.println("MultiThreading In Java : Threads Methods");

        TaskA t1 = new TaskA();
        TaskB t2 = new TaskB();

        System.out.println("Before start: " + t1.isAlive());   // false

        t1.start();
        t2.start();

        System.out.println("Before start: " + t1.isAlive());   // true


        try {
            t1.join(2000);  // main waits until TaskA finishes, its waits 2 sec , or join() to wait util threads finishs
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("This is Main Method Work");   
        
        // how to use join here ?  // main WAITS until t is done

    }
}
 
class TaskA extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5;i++) {
            System.out.println("A : " + i);
        try {
            Thread.sleep(1000);  // pause 1 sec 
        } catch (Exception e) {
            System.out.println("An Error Occurs");
        }
        }
    }
}
class TaskB extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5;i++) {
            System.out.println("B : " + i);
        try {
            Thread.sleep(1000);  // pause 1 sec 
        } catch (Exception e) {
            System.out.println("An Error Occurs");
        }
        }
    }
}

// sleep() — Make a Thread Pause
// sleep(ms) makes the current thread stop for that many milliseconds.

//  join() — Wait for Another Thread
// join() = "wait for that thread to finish before I continue."
// "join is used to wait for another thread until this thread finishes"
// main calls t1.join()	main waits for t1 to finish
// Thread A calls t2.join()	Thread A waits for t2 to finish
// Thread A calls A.join()	❌ Thread waits for itself → deadlock (never finishes)

// isAlive - check if thread is Live 

// Daemon Thread — "I'll die with the program"
// A daemon thread does not keep the program alive. When only daemon threads remain, the JVM exits.


// Every Thread Method You Need — Meanings
// Method	Meaning	Example

// start()	Start a new thread that runs run()	t.start()
// run()	The work to do — don't call directly	public void run(){...}
// sleep(ms)	Pause this thread for ms milliseconds	Thread.sleep(1000)
// join()	Wait for that thread to finish	t.join()
// join(ms)	Wait at most ms milliseconds	t.join(500)
// isAlive()	Is the thread still running?	t.isAlive()
// getName()	Get thread's name	t.getName()
// setName(s)	Set thread's name	t.setName("Worker-1")
// currentThread()	Get the currently running thread	Thread.currentThread()
// interrupt()	Ask a sleeping/waiting thread to stop	t.interrupt()
// isInterrupted()	Was it interrupted?	t.isInterrupted()
// yield()	Hint: give up CPU to others	Thread.yield()
// setPriority(int)	1–10, hint to scheduler (rarely matters)	t.setPriority(10)
// getPriority()	Get priority	t.getPriority()
// setDaemon(true)	Daemon = dies when main dies	t.setDaemon(true)
// isDaemon()	Is it a daemon?	t.isDaemon()
// Priority and yield are hints — the OS may ignore them. Don't depend on them.



// Quick Recap — The Only 5 Things to Remember

// extends Thread and override run() = define what the thread does.
// start() launches a new thread; run() just calls the method — no new thread.
// sleep(ms) pauses the current thread.
// join() makes me wait for that thread.
// currentThread().getName() tells you which thread you're in.
// □ Use setName and print names from inside run()
// □ Try interrupt() on a sleeping thread
// □ Make a daemon thread with while(true) and watch it die