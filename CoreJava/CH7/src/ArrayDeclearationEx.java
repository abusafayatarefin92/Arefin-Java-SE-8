
public class ArrayDeclearationEx {

    //int []y = new int[3]; Not good.
    int z[] = new int[5];

    public static void main(String[] args) {
        // One or single dimensional array
        int[] x = new int[2];
        x[0] = 10;
        x[1] = 25;
        System.out.println("x[0]: " + x[0]);
        System.out.println("x[1]: " + x[1]);
        System.out.println("x: " + x);
        for (int i : x) {
            System.out.println(i);
        }

        //Alternative way array declearation
        int p[] = {10, 25, 35, 23, 14, 32, 44, 91};// length 8.
        System.out.println("Length of p :" + p.length);
        System.out.println("p[5]: " + p[5]);

       // p = new int[9];

        for (int i : p) {
            System.out.println(i);
        }

    }
}
