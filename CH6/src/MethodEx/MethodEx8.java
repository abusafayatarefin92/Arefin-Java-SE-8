package MethodEx;


public class MethodEx8 {

    public static void main(String[] args) {
        MethodEx8 m = new MethodEx8();
        int rs = m.makeSubstituteFromTwoMethods(5, 7);
        System.out.println("Rs: " + rs);
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int makeMulti(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public int makeSubstituteFromTwoMethods(int n1, int n2) {
        int rs = makeMulti(n1, n2) - makeSum(n1, n2);
        return rs;
    }

    public void makemultiSingleMethod(int num1, int num2) {
        int rs = (num1 * num2) - (num1 + num2);
        System.out.println("Rs: " + rs);
    }
}
