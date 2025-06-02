package loianeTraining;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(2, 2, 5, 3));
    }

    static int sum(Integer... nums) {
        int sum = 0;

        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }
}
