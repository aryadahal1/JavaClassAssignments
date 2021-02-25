package day1Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter P : ");
        int P = input.nextInt();
        System.out.println("Enter T : ");
        int T = input.nextInt();
        System.out.println("Enter R : ");
        int R = input.nextInt();

        int SI = (P * T * R) / 100;
        System.out.println(" The amount of Simple Interest is " + SI);
        }
    }
