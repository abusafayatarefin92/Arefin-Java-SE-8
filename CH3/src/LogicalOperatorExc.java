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

public class LogicalOperatorExc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Yes 2");
        } else {
            System.out.println("No 2");
        }

        if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("Yes 3");
        } else {
            System.out.println("No 39");
        }
    }
}
