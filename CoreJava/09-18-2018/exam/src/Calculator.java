
public class Calculator {

    public static void main(String[] args) {
        System.out.println("The result is; " + calculation(6, 4, "*"));
    }

    public static int calculation(int x, int y, String z) {
        int answer = 0;
        String msg = "Please input a valid sign";

        if (z == "+") {
            answer = x + y;
        } else if (z == "-") {
            answer = x - y;
        } else if (z == "*") {
            answer = x * y;
        } else if (z == "/") {
            answer = x / y;
        } else if (z == "%") {
            answer = x % y;
        } else {
            System.out.println(msg);
        }

        return answer;
    }

}
