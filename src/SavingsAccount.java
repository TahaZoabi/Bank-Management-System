public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate, String accountHolderName, double balance, int accountNumber) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
