package loianeTraining.threads;

public class ThreadWithRunnable implements Runnable {

    private String threadName;
    private int temp;

    public ThreadWithRunnable(String threadName, int temp) {
        this.threadName = threadName;
        this.temp = temp;
        /*
        Thread thread = new Thread(this);
        thread.start();
        */
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": Cont - " + i);

                Thread.sleep(this.temp);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
