
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] x = {8, 9, 4, 1, 6, 7, 5, 11, 48, 21, 38};
        Arrays.sort(x, 2, 7);
        ArrayAsMethodArguments.displayArray(x);
    }
}
