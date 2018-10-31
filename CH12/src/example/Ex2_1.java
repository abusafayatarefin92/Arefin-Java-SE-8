package example;


public class Ex2_1 {

    public static int gatDivision(int x, int y) throws ArithmeticException {
        int rs = x / y;

        return rs;
    }

    public static void main(String[] args) {
        try {
            System.out.println(gatDivision(10, 0));
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("You cannot divide by zero");
        }

        System.out.println(getParseInt("Ten"));
    }

    public static int getParseInt(String str) {
        int rs = 0;

        try {
            rs = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("You cannot parse string like ten, five etc.");
        }

        return rs;
    }
}
