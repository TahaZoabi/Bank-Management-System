import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Account> accountsList;


    public Account createAccount(AccountType type) {
        if (type == AccountType.SAVINGS_ACCOUNT) {
            return new SavingsAccount(3);
        }
        return new CheckingAccount(500);
    }

    public void addAccount(Account account) {
        accountsList.add(account);
    }

    public void removeAccount(Account account) {
        accountsList.remove(account);
    }


    public Bank(String name) {
        this.name = name;
        accountsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccountsList() {
        return accountsList;
    }


}
