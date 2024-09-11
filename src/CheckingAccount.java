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


    @Override
    public void withdrawBalance(double amount) throws Exception {
        try {
            if (this.balance - amount < -this.overdraftLimit) {
                throw new Exception("Withdrawal amount exceeds the overdraft limit.");
            }
            this.balance -= amount;
            System.out.println(roundTwoDecimal(amount) + " has been successfully withdrawn from your bank account");
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
