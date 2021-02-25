package day3Assignments;
import java.util.Scanner;

public class VolOfACylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter radius of the Cylinder:");
        double r = input.nextDouble();
        System.out.println(" Enter length of the Cylinder:");
        double l = input.nextDouble();
        double area = 3.14 * r * r;
        double volume = area * l;
        System.out.println(" The vol of the Cylinder is: " + volume);
    }
}

