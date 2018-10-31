
public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStake<Integer> intStack = new GenericStake<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        System.out.println("The max number is: " + max(intStack));
    }

    public static double max(GenericStake<Integer> stack) {
        double max = stack.pop().doubleValue();

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();

            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}
