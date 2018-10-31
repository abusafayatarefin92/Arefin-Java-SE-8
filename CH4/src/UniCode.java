/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UniCode {

    public static void main(String[] args) {
        char ch = 'a';

        for (int i = 0; i < 26; i++) {
            System.out.println(ch++);
        }

        String x = "Bangladesh";

        for (int i = 0; i < x.length(); i++) {
            
            System.out.print(x.charAt(i) + " ");
        }
    }
}
