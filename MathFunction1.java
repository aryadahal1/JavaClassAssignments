package day3Assignments;
import java.util.Scanner;

public class MathFunction1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double u, t, a, s;

        System.out.println("Enter value of u: ");
        u = input.nextDouble();
        System.out.println("Enter value of t: ");
        t = input.nextDouble();
        System.out.println("Enter value of a: ");
        a= input.nextDouble();

        s = u * t + 0.5 * (a * t* t);
        System.out.println("The value of s is: " + s + " m ");

    }
}
