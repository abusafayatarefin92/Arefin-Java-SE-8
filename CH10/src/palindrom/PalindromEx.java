package palindrom;

public class PalindromEx {

    public static void main(String[] args) {
        //System.out.println(isPalindrom("Mum"));

        String[] x = {"Hello", "Mom", "mum", "moon", "noon", "eye", "soon"};
        System.out.println(countPalindrom(x));
    }

    public static boolean isPalindrom(String s) {
        boolean status = false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());

        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }

        return status;
    }

    public static int countPalindrom(String[] s) {
        int counter = 0;

        for (int i = 0; i < s.length; i++) {
            if (isPalindrom(s[i])) {
                counter++;
            }
        }

        return counter;
    }
}
