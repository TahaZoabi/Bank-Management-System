public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
