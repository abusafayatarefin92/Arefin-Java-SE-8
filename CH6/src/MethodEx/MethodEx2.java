package MethodEx;


public class MethodEx2 {

    static int abc;
    static int msg = 600;

    public MethodEx2() {
    }

    public static void main(String[] args) {
        System.out.println(display1());
        System.out.println(display2());
        System.out.println(display3());
        System.out.println(display4());
        System.out.println(display5());
        System.out.println(display6());

        int m1 = display1();
        System.out.println("M1: " + m1);
        int m2 = display2();
        System.out.println("M2: " + m2);
        int m3 = display3();
        System.out.println("M3: " + m3);
        int m4 = display4();
        System.out.println("M4: " + m4);
        int m5 = display5();
        System.out.println("M5: " + m5);
        int m6 = display6();
        System.out.println("M6: " + m6);

        MethodEx2 m = new MethodEx2();
        System.out.println("Method1: " + m.display1());
        System.out.println("Method2: " + m.display2());
        System.out.println("Method3: " + m.display3());
        System.out.println("Method4: " + m.display4());
        System.out.println("Method5: " + m.display5());
        System.out.println("Method6: " + m.display6());
    }

    public static int display1() {
        return 500;
    }

    public static int display2() {
        int i = 0;
        return i;

    }

    public static int display3() {
        return 1;

    }

    public static int display4() {
        int str = 100;
        return str;

    }

    public static int display5() {
        int abc = 200;
        return abc;

    }

    public static int display6() {
        return msg;

    }

}
