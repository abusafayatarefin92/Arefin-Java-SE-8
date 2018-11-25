
import java.util.Scanner;

public class CheckPoint2_30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * .06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100);
    }
}
