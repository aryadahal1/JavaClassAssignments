package Lab1;

public class BankAccount {
        String name;
        double balance;
        private int accountNumber;
        static int nextAccountNum = 1;

        //method overloading
        public void withdrawFunds(double amount) { balance -= amount;}
        public void withdrawFunds(double amount, double fee) { balance = balance - amount - fee;}
        public void depositFunds(double amount) { balance += amount;}
        public void depositFunds(double amount, double percent) { balance = balance + amount + ((percent / 100) * amount);}
        public void displayAccountInfo() {
            System.out.println("The name of the user is: " + name);
            System.out.println("The balance is: " + balance);
            System.out.println("The account number is: " + accountNumber);
        }

        //constructor overloading
        public BankAccount(){}
        public BankAccount(String name) {
            this.name = name;
            this.balance = 0.0;
            accountNumber = nextAccountNum;
            nextAccountNum += 1;
        }

        public BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
            accountNumber = nextAccountNum;
            nextAccountNum += 1;
        }

        public static void main(String[] args) {
            Lab1.BankAccount user1 = new Lab1.BankAccount("Biggie");
            user1.depositFunds(50.0);
            user1.displayAccountInfo();
            System.out.println("===================");

            Lab1.BankAccount user2 = new Lab1.BankAccount("Tupac", 100.0);
            user2.withdrawFunds(25, 3);
            user2.displayAccountInfo();
            System.out.println("=============");

            Lab1.BankAccount user3 = new Lab1.BankAccount("DeathRow");
            user3.depositFunds(25);
            user3.depositFunds(50, 5);
            user3.displayAccountInfo();
        }
}
