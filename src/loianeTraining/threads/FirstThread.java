package loianeTraining.threads;

public class FirstThread extends Thread {
    private String threadName;
    private int temp;

    public FirstThread(String threadName, int temp) {
        this.threadName = threadName;
        this.temp = temp;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName+ ":  Cont - " + i);

                Thread.sleep(this.temp);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

