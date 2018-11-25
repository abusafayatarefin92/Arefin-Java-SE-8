
public class RecursivepalindromUsingSubstring {

    public static boolean ispalindrom(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return ispalindrom(s.substring(1, s.length() - 1));
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
