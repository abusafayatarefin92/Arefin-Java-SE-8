package example;


public class Ex1 {

    static int x = 10;
    static int y = 0;
    static String z = "10";

    public static void main(String[] args) {
        System.out.println("Hello!");
        //System.out.println(Integer.parseInt(z));
        //  System.out.println(x / y);

        try {
            System.out.println(Integer.parseInt(z));
            System.out.println(x / y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
