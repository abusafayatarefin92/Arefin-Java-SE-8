package MethodEx;


import java.util.Scanner;

public class MethodEx7 {

    public int makeSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        int x = input.nextInt();
        System.out.print("Enter value for y: ");
        int y = input.nextInt();

        MethodEx6 m = new MethodEx6();
        int rs = m.makeSum(x, y, 20);
        System.out.println("Sum: " + rs);
    }
}
