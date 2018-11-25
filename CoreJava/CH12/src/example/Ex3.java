package example;


public class Ex3 {

    public static void main(String[] args) {
        System.out.println("11111111111111111");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("You cannot divide by zero");
        }

        System.out.println("222222222222222");
        try {
            System.out.println(Integer.parseInt("Ten"));
        } catch (Exception e) {
            System.out.println("You cannot parse ten, five etc");
        }

        System.out.println("33333333333333333333");
    }

}
