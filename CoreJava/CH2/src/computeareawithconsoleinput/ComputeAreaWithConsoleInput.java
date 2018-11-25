/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeareawithconsoleinput;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        // TODO code application logic here
    }
    
}
