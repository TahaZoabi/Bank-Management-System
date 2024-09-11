public abstract class Account {
    protected String accountHolderName;
    protected double balance;
    protected int accountNumber;

    public Account(String accountHolderName, double balance, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account() {

    }

    protected String roundTwoDecimal(double money) {
        return String.format("$%.2f", money);
    }

    public void checkBalance() {
        System.out.println("Your current balance is " + roundTwoDecimal(this.balance));
    }

    public void depositBalance(double amount) {
        this.balance += amount;
        System.out.println(roundTwoDecimal(amount) + " has been successfully deposited into your bank account");
    }

    public void withdrawBalance(double amount) throws Exception {
        try {
            if (amount > this.balance) {
                throw new Exception("\"Withdrawal Error: Your current balance is " + roundTwoDecimal(this.balance) + ". You are attempting to withdraw " + roundTwoDecimal(amount) + ", which exceeds your available balance. \nPlease enter a smaller amount or check your account balance.\"");
            }
            this.balance -= amount;
            System.out.println(roundTwoDecimal(amount) + " has been successfully withdrawn from your bank account");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
