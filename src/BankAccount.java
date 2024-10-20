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
    }public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Deposit amount must be positive.");
        }
        balance += amount; // Add the amount to balance
    }


}
