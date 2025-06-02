package loianeTraining.threads;

public class CalculatorSynchronized {
    private int sum = 0;

    public synchronized int sum(int[] numbers) {
        sum = 0;

        for (int number : numbers) {
            sum += number;

            System.out.println(Thread.currentThread().getName() + ": number = " + number + "; sum = " + sum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }
}
