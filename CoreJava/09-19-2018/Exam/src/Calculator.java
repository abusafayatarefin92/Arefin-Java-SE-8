
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        double secondNumber = input.nextInt();

        double answer = calculate(firstNumber, secondNumber, "/");
        System.out.println("The answer is; " + answer);
    }

    public static double calculate(double x, double y, String z) {
        double result = 0;

        if (z == "+") {
            return result = x + y;
        } else if (z == "-") {
            return result = x - y;
        } else if (z == "*") {
            return result = x * y;
        } else if (z == "/") {
            return result = x / y;
        } else if (z == "%") {
            return result = x % y;
        }
        return result;
    }

}
