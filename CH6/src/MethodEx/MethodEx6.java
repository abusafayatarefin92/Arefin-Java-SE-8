package MethodEx;


public class MethodEx6 {

    int x = 10;
    int y = 5;

    public int makeSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String[] args) {
        MethodEx6 m = new MethodEx6();
        int rs = m.makeSum(m.x, m.y, 20);
        System.out.println("Sum: " + rs);
    }
}
