
import java.util.Scanner;

public class AnalyzeNumberNoInput {

    public static void main(String[] args) {
        double sum = 0;
        int n = 10;
        int bignumber = 0;
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = i + 1;
            sum += x[i];
        }

        double avg = sum / n;
        System.out.println("Avg: " + avg);

        for (int i : x) {
            if (i > avg) {
                bignumber++;
            }
        }
        System.out.println("Bignumber: " + bignumber);
    }

}
