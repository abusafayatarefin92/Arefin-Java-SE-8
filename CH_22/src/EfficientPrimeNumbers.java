
import java.util.Scanner;

public class EfficientPrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = input.nextInt();

        java.util.List<Integer> list = new java.util.ArrayList<>();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int squreRoot = 1;

        System.out.println("The prime numbers are: ");

        while (number <= n) {
            boolean isPrime = true;

            if (squreRoot * squreRoot < number) {
                squreRoot++;
            }

            for (int k = 0; k < list.size() && list.get(k) <= squreRoot; k++) {
                isPrime = false;
                break;
            }

            if (isPrime) {
                count++;
                list.add(number);

                if (count % NUMBER_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.println(number + " ");
                }
            }

            number++;

        }
        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
