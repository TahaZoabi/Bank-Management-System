public abstract class Account {
    protected double balance;
    protected final int accountID;

    public Account(int accountID, double initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    public Account(int accountID) {
        this(accountID, 0.0);
    }

    private String formatBalance(double amount) {
        return String.format("$%.2f", amount);
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + formatBalance(this.balance));
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        System.out.println(formatBalance(amount) + " has been successfully deposited into your account.");
    }

    public void withdrawBalance(double amount) throws Exception {
        try {

            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if (amount > this.balance) {
                throw new Exception("Withdrawal Error: Your current balance is " + formatBalance(this.balance)
                        + ". You are attempting to withdraw " + formatBalance(amount) + ", which exceeds your available balance. \nPlease enter a smaller amount or check your account balance.");
            }
            this.balance -= amount;
            System.out.println(formatBalance(amount) + " has been successfully withdrawn from your account.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }
}
