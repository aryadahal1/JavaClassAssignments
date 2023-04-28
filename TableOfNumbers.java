package day5Assignments;
import java.util.Scanner;

public class TableOfNumbers {

    public static void main(String[] args) {
            System.out.println("Enter a number you want to print table of: ");
            Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                for(int i=1; i<= 20; i++) {  // 20 samma ko table dekhaucha
                    System.out.println(""+num+" X " + i + " = "+(num*i));
                }
            }
    }

