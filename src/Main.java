public class Main {

    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");


        Customer customer = new Customer("Taha Zoabi");

        Account acc1 = bank.createAccount(customer, AccountType.SAVINGS_ACCOUNT);
        Account acc2 = bank.createAccount(customer, AccountType.CHECKING_ACCOUNT);


        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).applyInterest();
        }

    }
}