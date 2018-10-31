
public class NumericTypeConversion {

    public static void main(String[] args) {
        int x = 10;
        long y = x;
        System.out.println("X: " + x + " Y: " + y);

        long p = 15L;
        int q = (int) p;
        System.out.println("P: " + p + " Q: " + q);
        double z = p;
        float r = p;

        ////////////////////////2(31) - 1
        double rangeOfInt = Math.pow(2, 31) - 1;
        System.out.println("rangeOfInt: " + rangeOfInt);

        int intValue = 2147483647;
        long longValue = 2147483648999999999L;

        long a = 500;
        int b = (int) a;
        System.out.println("A: " + a + " B: " + b);

    }
}
