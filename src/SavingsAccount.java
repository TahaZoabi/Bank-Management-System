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


    @Override
    public void applyInterest() {
        double interestAmount = this.balance * (this.interestRate / 100);
        this.balance += interestAmount;
    }

}
