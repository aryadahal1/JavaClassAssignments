package day4Assignments;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        if (num > 0){
            System.out.println("Number is positive");
        }

        else if (num < 0){
            System.out.println("Number is negative");
        }

        else{
            System.out.println("Number is zero");
        }
    }

}

