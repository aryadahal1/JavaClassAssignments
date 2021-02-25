package day3Assignments;
import java.util.Scanner;
public class AreaOfShapes {

    public static double AreaOfCircle(double radius){
        return 3.14 * radius * radius;
    }
    public static double AreaOfRectangle(double length, double width){
        return length * width;
    }
    public static double AreaOfTriangle(double base, double height){
        return (base * height)/2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter length of rectangle: ");
            double length = input.nextInt();
            System.out.println("Enter width of rectangle : ");
            double width = input.nextInt();

            double areaOfRectangle = length * width;
            System.out.println(" The area of rectangle is " + areaOfRectangle);

            System.out.println("Please enter the base of the triangle: ");
            double base = input.nextInt();
            System.out.println("Please enter the height of the triangle: ");
            double height = input.nextInt();

            double areaOfTriangle = 0.5 * base * height;
            System.out.println(" The area of the triangle is " + areaOfTriangle);

            System.out.println("Please enter the radius of the circle: ");
            double radius = input.nextInt();

            double areaOfCircle = 3.14 * radius * radius;
            System.out.println(" The area of the Circle " + areaOfCircle);
        }

    }

