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

public class ConcateString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First text: ");
        String a = input.nextLine();

        System.out.print("Enter Second text: ");
        String b = input.nextLine();

        System.out.print("Enter Third text: ");
        String c = input.nextLine();

        System.out.println(a + " " + b + " " + c);
    }
}
