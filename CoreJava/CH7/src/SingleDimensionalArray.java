
public class SingleDimensionalArray {

    public static void main(String[] args) {
        //Single dimensional array, ine [] sign
        int p[] = {10, 25, 35, 23, 14, 32, 44, 91};// length 8.
        System.out.println("Length of p :" + p.length);
        System.out.println("p[5]: " + p[5]);

        for (int i : p) {
            System.out.print(i + " ");
        }
        System.out.println();

        int q[] = {40, 55, 58, 61, 53, 73};
        for (int i : p) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
