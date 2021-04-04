package Lab1;

import java.util.Scanner;

public class TransactionService {

    public static void main(String[] args) {
        Transactions obj = new Transactions("John");
        obj.showMenu();
    }
}

class Transactions {
    double balance;
    double amount;
    double depositAmount;
    double withdrawAmount;
    double previousTransaction;
    String cName;


    public Transactions(String cName) {
    }

    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void checkPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction");
        }
    }

    void showMenu() {
        char operation = '\0';
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome Dear Customer");
        System.out.println("Choose from the following operations:  ");

        System.out.println("A. Check your Balance");
        System.out.println("B. Deposit?");
        System.out.println("C. Withdraw?");
        System.out.println("D. Previous Transaction?");
        System.out.println("E. Exit?");


        do {
            System.out.println("Enter the operation: ");
            operation = input.next().charAt(0);
            switch (operation) {
                case 'A':
                    System.out.println("================");
                    System.out.println("Your balance is: " + balance);
                    System.out.println("================");
                    break;
                case 'B':
                    System.out.println("===============");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("================");
                    depositAmount = input.nextDouble();
                    deposit(depositAmount);
                    break;
                case 'C':
                    System.out.println("===============");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("===============");
                    withdrawAmount = input.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 'D':
                    System.out.println("================");
                    checkPreviousTransaction();
                    System.out.println("================");
                    break;
                case 'E':
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (operation != 'E');
        System.out.println("Good Day.");

    }
}
