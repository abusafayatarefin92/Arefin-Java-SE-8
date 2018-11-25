
import java.util.Scanner;

public class RangeSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int firstnumber = input.nextInt();

        System.out.println("Enter First number: ");
        int secondnumber = input.nextInt();

        int answer = makeSum(firstnumber, secondnumber);
        System.out.println("The answer is: " + answer);
    }

    public static int makeSum(int x, int y) {
        int sum = 0;
        if (x > 0 || y > 0) {
            if (x > y) {
                while (x >= y) {
                    sum += x;
                    x--;
                }
            } else if (x < y) {
                while (x <= y) {
                    sum += x;
                    x++;
                }
            } else {
                return x;
            }
        } else {
            return -1;
        }

        return sum;
    }
}
