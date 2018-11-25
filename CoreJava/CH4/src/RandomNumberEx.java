/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RandomNumberEx {

    public static void main(String[] args) {
        int singleDigitNumber = (int) (Math.random() * 10);
        System.out.println("Single digit number: " + singleDigitNumber);

        int twoDigitNumber = (int) (Math.random() * 100);
        System.out.println("Single digit number: " + twoDigitNumber);

        int threeDigitNumber = (int) (Math.random() * 1000);
        System.out.println("Single digit number: " + threeDigitNumber);

        double x = Math.rint(2.6);
        System.out.println("Math.rint(2.6): " + x);

    }
}
