public class Main {

    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");


        Customer customer = new Customer("Taha Zoabi", 1);

        Account acc1 = bank.createAccount(customer, AccountType.SAVINGS_ACCOUNT);
        Account acc2 = bank.createAccount(customer, AccountType.CHECKING_ACCOUNT);
        
        acc1.deposit(150);
        acc2.deposit(200);
        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).applyInterest();
        }

        acc1.checkBalance();
        acc2.withdrawBalance(900);
        acc2.checkBalance();

    }
}