package day1Assignments;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = input.nextInt();
        System.out.println("Enter b : ");
        int b = input.nextInt();
        System.out.println("Enter c : ");
        int c = input.nextInt();

        int average = (a + b + c) / 3;
        System.out.println(" The average of a, b, and c is " + average);
    }
}
