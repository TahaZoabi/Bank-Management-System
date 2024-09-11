public abstract class Account {

    protected double balance;
    protected int accountID;

    public Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public Account(int accountID) {
        this(accountID, 0);
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


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountNumber() {
        this.accountID += 1;
    }
}
