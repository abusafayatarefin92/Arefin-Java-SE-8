package example;


public class Ex6 {

    public static void main(String[] args) {
        System.out.println("11111111111111111");
        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("ten"));
        } catch (ArithmeticException | NumberFormatException ae) {
            ae.printStackTrace();
        }

        System.out.println("222222222222222");

        System.out.println("33333333333333333333");
    }
}
