public class CheckingAccount extends Account {
    private double overdraftLimit = 500;

    public CheckingAccount(int accountID, double balance) {
        super(accountID, balance);

    }

    public CheckingAccount(int accountID) {
        this(accountID, 0);
    }


    @Override
    public void withdrawBalance(double amount) throws Exception {
        try {
            if (this.balance - amount < -this.overdraftLimit) {
                throw new Exception("Withdrawal amount exceeds the overdraft limit.");
            }
            super.withdrawBalance(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
