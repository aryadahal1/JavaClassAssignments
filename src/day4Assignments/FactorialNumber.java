package day4Assignments;
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i;
        double factorial = 1;
        System.out.println("Enter the number you want to find the factorial: ");
        int number = input.nextInt();

        for(i = 1; i<=number; i++) {
            factorial = factorial * i;
        }
                System.out.println("Factorial of the given number is: " + factorial); }

    }

