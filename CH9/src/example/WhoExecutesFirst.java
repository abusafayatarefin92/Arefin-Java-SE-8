package example;


public class WhoExecutesFirst {

    public static void main(String[] args) {
        System.out.println("I am from main method");
    }

    static {
        System.out.println("I am from static block");
    }

    public WhoExecutesFirst() {
        System.out.println("I am from constructor");
    }
}
