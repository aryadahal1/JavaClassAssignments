package day3Assignments;
import java.util.Scanner;
public class PerimeterOfShapes {
    public static double perimeterOfCircle(double radius){
        return 3.14 * 2 * radius;
    }
    public static double perimeterOfRectangle(double length, double width){
        return 2 * (length + width);
    }
    public static double perimeterOfTriangle(double base, double height, double length2){
        return length2 + base + height;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        double length = input.nextInt();
        System.out.println("Enter width of rectangle : ");
        double width = input.nextInt();

        double perimeterOfRectangle = 2 * (length + width);
        System.out.println(" The perimeter of rectangle is " + perimeterOfRectangle);

        System.out.println("Please enter the base of the triangle: ");
        double base = input.nextInt();
        System.out.println("Please enter the height of the triangle: ");
        double height = input.nextInt();
        System.out.println("Please enter the length of the triangle: ");
        double length2 = input.nextInt();

        double perimeterOfTriangle = length2 + base + height;
        System.out.println(" The perimeter of the triangle is " + perimeterOfTriangle);

        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextInt();

        double perimeterOfCircle = 3.14 * 2 * radius;
        System.out.println(" The perimeter of the Circle " + perimeterOfCircle);
    }

}
