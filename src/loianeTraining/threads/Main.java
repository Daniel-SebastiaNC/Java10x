package loianeTraining.threads;

public class Main {
    public static void main(String[] args) {
        /*
        FirstThread thread1 = new FirstThread("Thread #1", 1000);
        //thread.start();

        FirstThread thread2 = new FirstThread("Thread #2", 500);
        */

        /*
        ThreadWithRunnable thread1 = new ThreadWithRunnable("Thread #1", 1000);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        ThreadWithRunnable thread2 = new ThreadWithRunnable("Thread #2", 500);
        //Thread t2 = new Thread(thread2);
        //t2.start();
        */

        ThreadWithRunnable thread1 = new ThreadWithRunnable("Thread #1", 1000);
        Thread t1 = new Thread(thread1);
        t1.start();

        ThreadWithRunnable thread2 = new ThreadWithRunnable("Thread #2", 500);
        Thread t2 = new Thread(thread2);
        t2.start();

        //while (t1.isAlive() || t2.isAlive()) {}

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final");

        //t1.setPriority(Thread.MAX_PRIORITY);
        //t1.setPriority(10);

        //t2.setPriority(Thread.MIN_PRIORITY);
        //t2.setPriority(1);


    }
}
