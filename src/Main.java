public class Main {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");
        Account accountOne = bank.createAccount(AccountType.SAVINGS_ACCOUNT);
        Account accountTwo = bank.createAccount(AccountType.CHECKING_ACCOUNT);
        bank.addAccount(accountOne);
        bank.addAccount(accountTwo);

        Client client = new Client("Taha Zoabi", 1);

        System.out.println(bank.getAccountsList());

        System.out.println(accountOne.getBalance());
        accountOne.depositBalance(15);
        accountOne.checkBalance();
        accountOne.withdrawBalance(17);

    }


}