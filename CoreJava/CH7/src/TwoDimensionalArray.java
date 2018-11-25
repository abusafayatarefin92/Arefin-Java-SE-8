
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int x[] = {2, 3, 5};
        int y[] = {6, 7, 8};

        int twoD[][] = {
            {2, 3, 5, 9},
            {6, 7, 8},
            {1, 4, 9, 15}
        };

        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("twoD[2][0]: " + twoD[2][0]);
        System.out.println("twoD[1][1]: " + twoD[1][1]);

        String twoDimension[][] = {
            {"1", "2", "3", "4"},
            {"5", "6", "7"},
            {"8", "9", "10", "11"}
        };

        for (String oneD[] : twoDimension) {
            for (String i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("twoDimension[1][2]: " + twoDimension[1][2]);
        System.out.println("twoDimension[2][3]: " + twoDimension[2][3]);
    }

}
