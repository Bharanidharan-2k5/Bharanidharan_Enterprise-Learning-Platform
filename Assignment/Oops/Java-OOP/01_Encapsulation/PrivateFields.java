class BankAccount {
    private double balance = 1000.0;
    public double getBalance() {
        return balance;
    }
}

public class PrivateFields {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Balance: " + account.getBalance());
    }
}
