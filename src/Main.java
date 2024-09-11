public class Main {
    public static void main(String[] args) throws Exception {

        Bank bank = new Bank("Vertex Bank");
        Account accountOne = bank.createAccount(AccountType.SAVINGS_ACCOUNT);
        Account accountTwo = bank.createAccount(AccountType.CHECKING_ACCOUNT);


        Customer customer = new Customer("John Wick", 1);

        accountTwo.depositBalance(100);
        accountTwo.withdrawBalance(400);
        System.out.println(accountTwo.getBalance());


        System.out.println(accountOne.getBalance());
        accountOne.depositBalance(15);
        accountOne.checkBalance();
        accountOne.applyInterest();


//        SavingsAccount ac = new SavingsAccount(3);
//        ac.depositBalance(500);
//        ac.applyInterest();
//        ac.checkBalance();

    }


}