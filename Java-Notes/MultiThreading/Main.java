
//   The Full Example — All Methods Together

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("=== THREAD INFO ===");
        Thread current = Thread.currentThread();
        System.out.println("Current thread: " + current.getName());
        System.out.println("Thread ID: " + current.getId());
        System.out.println("Priority: " + current.getPriority());
        System.out.println("Is daemon: " + current.isDaemon());

        // ---- Create workers ----
        Worker w1 = new Worker("Worker-1");
        Worker w2 = new Worker("Worker-2");

        // ---- setName / getName / setPriority / getId ----
        w1.setName("Worker-1-Renamed");
        w2.setPriority(Thread.MAX_PRIORITY);   // 10
        System.out.println("\n" + w1.getName() + " id=" + w1.getId()
                + " priority=" + w1.getPriority());
        System.out.println(w2.getName() + " id=" + w2.getId()
                + " priority=" + w2.getPriority());
        System.out.println("Thread state (before start): " + w1.getState());

        // ---- isAlive BEFORE start ----
        System.out.println("\nBefore start: isAlive = " + w1.isAlive());

        // ---- start() ----
        w1.start();
        w2.start();

        // ---- isAlive AFTER start ----
        System.out.println("After start:  isAlive = " + w1.isAlive());
        System.out.println("State after start: " + w1.getState());

        // ---- yield() demo thread ----
        Thread yielder = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Yielder yielding...");
                Thread.yield();   // hint to scheduler: give others a chance
            }
        }, "Yielder");
        yielder.start();

        // ---- sleep() ----
        Thread.sleep(200); // main sleeps briefly

        // ---- isAlive mid-flight ----
        System.out.println("\nMid-flight state w1: " + w1.getState()); // TIMED_WAITING (in sleep)
        System.out.println("Mid-flight state w2: " + w2.getState());

        // ---- join() ----
        w1.join();
        w2.join();
        yielder.join();

        System.out.println("\nAfter join:   isAlive = " + w1.isAlive());
        System.out.println("Final state w1: " + w1.getState()); // TERMINATED

        // ---- interrupt() demo ----
        Worker sleepy = new Worker("Sleepy");
        sleepy.start();
        Thread.sleep(150);
        System.out.println("\nInterrupting Sleepy...");
        sleepy.interrupt();            // causes InterruptedException inside sleep
        sleepy.join();
        System.out.println("Sleepy isAlive = " + sleepy.isAlive());
        System.out.println("Sleepy isInterrupted = " + sleepy.isInterrupted());

        // ---- setDaemon() demo ----
        Thread daemon = new Thread(() -> {
            while (true) {
                try { Thread.sleep(500); } catch (InterruptedException e) { return; }
                System.out.println("Daemon heartbeat...");
            }
        }, "Daemon-Thread");
        daemon.setDaemon(true);        // must be set before start
        daemon.start();
        System.out.println("\nDaemon isDaemon = " + daemon.isDaemon());
        Thread.sleep(700);             // let it tick once

        // ---- interrupt() to stop daemon early ----
        daemon.interrupt();

        System.out.println("\nALL DONE");
    }
}

class Worker extends Thread {
    Worker(String name) {
        super(name);                   // set thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " -> " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // restore interrupt flag (best practice)
                Thread.currentThread().interrupt();
                System.out.println(getName() + " was interrupted");
                return;
            }
        }
        System.out.println(getName() + " finished");
    }
}


// Summary of Thread Methods Demonstrated
// Method	Purpose
// start()	Begin execution — run() is invoked
// run()	Actual task code (never call directly)
// getName() / setName()	Read / change thread name
// getId()	Unique long ID
// getPriority() / setPriority()	1–10 (MIN_PRIORITY … MAX_PRIORITY)
// isAlive()	true after start(), false after termination
// getState()	NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
// sleep(ms)	Pause current thread (static)
// yield()	Hint to scheduler to give other threads a turn (static)
// join()	Wait for that thread to die
// interrupt()	Signal interruption → InterruptedException in blocking call, or sets interrupt flag
// isInterrupted()	Check flag without clearing it
// interrupted()	Static; check flag and clear it
// setDaemon(true) / isDaemon()	Daemon thread (JVM won't wait for it) — must be set before start()
// currentThread()	Static — reference to the running thread
