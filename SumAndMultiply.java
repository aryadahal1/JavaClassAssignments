package day6Assignments;
import java.util.Scanner;

public class SumAndMultiply {

    public static void main(String[] args) {

        int m, sum = 0, mul = 1;

        System.out.println("Enter the numbers you want to sum and multiply: ");

        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        while (m > 0) {
            sum = sum + (m % 10);
            m = m / 10;
            while (m != 0) {
                mul = mul * (m % 10);
                m = m / 10;
            }
            System.out.println("Sum of Digits: " + sum);
            System.out.println("Product of Digits: " + mul);

        }

    }
}
