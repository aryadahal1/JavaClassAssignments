package day3Assignments;
import java.util.Scanner;

public class PoundToKilogram {

    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        //Declaring variables
        double pounds;
        double kilograms;

        //Receive input from user
        System.out.println(" Enter weight in Pound: ");
        pounds = input.nextDouble();

        //Convert to Kg
        kilograms = pounds * 0.454;

        //Display output
        System.out.println(" Weight in Kilogram is " + kilograms + " kg ");

    }
}
