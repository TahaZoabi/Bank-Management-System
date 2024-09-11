public class Main {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");


        Customer customer = new Customer("Taha Zoabi");

        bank.createAccount(customer, AccountType.SAVINGS_ACCOUNT);
        bank.createAccount(customer, AccountType.CHECKING_ACCOUNT);

    }


}