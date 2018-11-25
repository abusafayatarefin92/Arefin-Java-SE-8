/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Safayat
 */
import java.util.Scanner;

public class ComputeAndInterpreteBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inchs: ");
        double height = input.nextDouble();

        final double METERS_PER_INCH = 0.0254;

        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
