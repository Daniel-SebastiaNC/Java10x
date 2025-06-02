package loianeTraining.threads;

public class ThreadSum implements Runnable {

    private String name;
    private int[] numbers;
    private static CalculatorSynchronized calculator = new CalculatorSynchronized();

    public ThreadSum(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println(this.name + " started");
        int sum = calculator.sum(numbers);
        System.out.println(this.name + " sum = " + sum);
        System.out.println(this.name + " finished");
    }
}
