public class Main {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");
        Account accountOne = bank.createAccount(AccountType.SAVINGS_ACCOUNT);
        Account accountTwo = bank.createAccount(AccountType.CHECKING_ACCOUNT);

        System.out.println(accountOne.getBalance());
        accountOne.depositBalance(15);
        accountOne.checkBalance();
        accountOne.withdrawBalance(17);

    }


}