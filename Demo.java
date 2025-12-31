public class Demo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Nikitha", 99, 10000);

        b1.displayAccount();
        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayAccount();
    }
}
class BankAccount {
    String bankholder;
    int banknumber;
    int balance;

    BankAccount(String h, int n, int b) {
        this.bankholder = h;
        this.banknumber = n;
        this.balance = b;
    }

    void displayAccount() {
        System.out.println("Name of the Holder: " + bankholder);
        System.out.println("Bank Number: " + banknumber);
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

