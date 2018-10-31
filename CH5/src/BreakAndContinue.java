public class BreakAndContinue {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            
        }
        System.out.println(i);

        int j;
        for (j = 1; j <= 20; j++) {
            if (j % 2 == 1) {
                if (j == 5) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
