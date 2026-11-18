public class MyThreads {
    public static void main(String[] args) {
        
        System.out.println("MultiThreading : Extends Thread Class");

        System.out.println("Example of Running Two Task Concurrently TaskA and TaskB");

        TaskA tA = new TaskA();
        tA.start();

        TaskB tB = new TaskB();
        tB.start();

        // new TaskA().start();
        // new TaskB().start();

        // new TaskA().run();   // If We Calls run() , thread will not run Concurrently ...
        // new TaskB().run();   // It Will run One by One 


    }
}

class TaskA extends Thread {
    @Override
    public void run() {
        for(int i = 1;i <= 5;i++) {
            System.out.println("Task A : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class TaskB extends Thread {
    @Override
    public void run() {
        for(int i = 1;i <= 5;i++) {
            System.out.println("Task B : " + i);
        }
    }
}

// ❗ See how A and B are mixed together? That's two threads running at the same time. The order is never guaranteed — it depends on the OS scheduler.
// If you had done run() instead of start(), output would always be A all five, then B all five (one after the other, no parallelism).


