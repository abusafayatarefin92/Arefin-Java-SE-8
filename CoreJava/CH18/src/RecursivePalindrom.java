
public class RecursivePalindrom {

    public static boolean ispalindrom(String s) {
        return isPalindrom(s, 0, s.length() - 1);
    }

    private static boolean isPalindrom(String s, int low, int high) {
        if (high <= low) {
            return true;
        } else if (s.charAt(low) != s.charAt(high)) {
            return false;
        } else {
            return isPalindrom(s, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrom? " + ispalindrom("moon"));
        System.out.println("Is noon a palindrom? " + ispalindrom("noon"));
        System.out.println("Is a a palindrom? " + ispalindrom("a"));
        System.out.println("Is aba a palindrom? " + ispalindrom("aba"));
        System.out.println("Is ab a palindrom? " + ispalindrom("ab"));
    }

}
