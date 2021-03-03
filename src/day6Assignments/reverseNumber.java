package day6Assignments;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int num = input.nextInt();
        System.out.println("The number you entered is " + num);

        int rNum=0;
        while(num != 0) {
            int digit = num % 10;
            rNum = rNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse of the number you entered is: " + rNum);
    }
}
