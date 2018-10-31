/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
import java.util.Scanner;

public class NestedIfEx {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lucky number between 500 and 1000: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            num += 150;
            if (num % 5 > 2) {
                num += 200;
            } else {
                num -= 200;

            }
        } else {
            num -= 500;
            num += 200;
            if (num % 3 > 2) {
                num += 500;
            }
        }
        System.out.println("Total Score: " + num);
    }
}
