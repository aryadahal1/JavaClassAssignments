package day4Assignments;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value");
        int num1 = input.nextInt();
        System.out.println("Enter second value");
        int num2 = input.nextInt();
        System.out.println("Enter third value");
        int num3 = input.nextInt();


        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest Number");

        else
            System.out.println(num3+" is the largest Number");
    }
}
