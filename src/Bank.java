import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Account> accountList;
    private int nextAccountNumber = 1;

    public Bank(String name) {
        this.name = name;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccountsList() {
        return accountList;
    }

    public Account createAccount(Customer customer, AccountType type) {
        int accountNumber = nextAccountNumber++;
        Account newAccount;

        switch (type) {
            case SAVINGS_ACCOUNT:
                newAccount = new SavingsAccount(accountNumber);
                break;
            case CHECKING_ACCOUNT:
                newAccount = new CheckingAccount(accountNumber);
                break;
            default:
                throw new IllegalArgumentException("Unsupported account type");
        }

        customer.setAccountNumber(accountNumber);
        addAccount(newAccount);
        return newAccount;
    }

    public void addAccount(Account account) {
        if (account != null && !accountList.contains(account)) {
            accountList.add(account);
        }
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }
}
