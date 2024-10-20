public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to return the current account balance
    public double accountBalance() {
        return balance;
    }
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds.");
        }
        balance -= amount; // Deduct the amount from balance
    }

}
