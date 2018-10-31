
import java.util.Scanner;

public class MakeSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for starting number: ");
        int startingNumber = input.nextInt();
        System.out.print("Enter the value for ending number: ");
        int endingingNumber = input.nextInt();
        System.out.println("The sum is: " + calculation(startingNumber, endingingNumber));

    }

    public static int calculation(int x, int y) {
        int sum = 0;

        if (x > 0 || y > 0) {
            if (x < y) {
                while (x <= y) {
                    sum += x;
                    x++;
                }
            } else if (x > y) {
                while (x >= y) {
                    sum += x;
                    x--;
                }
            } else {
                sum = x;
            }
        } else {
            return -1;
        }

        return sum;
    }

}
