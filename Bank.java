import java.util.Scanner;

class Bank {
    double balance = 10000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Bank b = new Bank();

            b.displayBalance();

            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            b.deposit(d);

            System.out.print("Enter withdrawal amount: ");
            double w = sc.nextDouble();
            b.withdraw(w);

            b.displayBalance();
        }
    }
}
