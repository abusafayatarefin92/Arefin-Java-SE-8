/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringCompare {

    public static void main(String[] args) {
        String str1 = "Bangladesh";
        String str2 = "BanglAdesh";

        if (str1.equals(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String s1 = "abd";
        String s2 = "abb";

        if (s1.compareTo(s2) < 0) {
            System.out.println("Less than zero");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("Greater than zero");
        } else {
            System.out.println("Equal than zero");
        }

        String str = "Dhaka";
        System.out.println(str.indexOf("a"));

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("a", 3));

        String ss = "10";
        int i = Integer.valueOf(ss);
        
        System.out.println("I: " + i);
        
        double salary = 500.00;
        String sal = String.valueOf(salary);
        
        System.out.println("Sal: " + sal);
        
        long sallong = Long.valueOf(ss);
        
        System.out.println("Sallong: " + sallong);
        
        boolean bool = true;
        String boo = String.valueOf(bool);
        
        System.out.println("Boo: " + boo);
        
        char ch = 'A';
        String chr = String.valueOf(ch);
        
        System.out.println("Chr: " + chr);
        
        
    }

}
