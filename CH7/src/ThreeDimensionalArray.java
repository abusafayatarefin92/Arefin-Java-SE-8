
public class ThreeDimensionalArray {

    public static void main(String[] args) {
        int x[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int y[][] = {
            {7, 8, 9},
            {4, 5, 6},
            {1, 2, 3}
        };

        int[][][] threeD = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
            }
        };

        for (int twoD[][] : threeD) {
            for (int oneD[] : twoD) {
                for (int i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        String threeDimension[][][] = {
            {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
            },
            {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
            },
            {
                {"j", "k", "l"},
                {"10", "11", "12"},
                {"m", "13", "n"}
            }
        };

        for (String twoD[][] : threeDimension) {
            for (String oneD[] : twoD) {
                for (String i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
