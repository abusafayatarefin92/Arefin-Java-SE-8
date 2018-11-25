package example;


public class Ex5 {

    public static void main(String[] args) {
        System.out.println("11111111111111111");
        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("ten"));
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("You cannot parse ten, five etc");
        } finally {
            System.out.println("Need client-side validation");
        }

        System.out.println("222222222222222");

        System.out.println("33333333333333333333");
    }
}
