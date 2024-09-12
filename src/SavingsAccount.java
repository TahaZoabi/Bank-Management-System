public class SavingsAccount extends Account {
    private double interestRate = 3;

    public SavingsAccount(int accountID, double balance) {
        super(accountID, balance);

    }

    public SavingsAccount(int accountID) {
        this(accountID, 0);
    }


    public void applyInterest() {
        double interestAmount = this.balance * (this.interestRate / 100);
        this.balance += interestAmount;
    }

}
