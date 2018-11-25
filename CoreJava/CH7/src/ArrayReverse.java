
import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int x[] = {5, 8, 7, 15, 25, 78, 99, 11};
        Arrays.sort(x);
        int[] newArray = new int[x.length];
        int j = 0;

        for (int i = x.length - 1; i >= 0; i--) {
            newArray[j] = x[i];
            j++;
        }

        for (int k : newArray) {
            System.out.print(k + " ");
        }

    }
}
