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

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an input: ");
        
        int status = input.nextInt();
        
        switch (status) {
            case 0:
                System.out.println("0000");
                break;
            case 1:
                System.out.println("1111");
                break;
            case 2:
                System.out.println("2222");
                break;
            case 3:
                System.out.println("3333");
                break;
            default:
                System.out.println(".......Default.......");
                System.exit(1);
        }
    }
}
