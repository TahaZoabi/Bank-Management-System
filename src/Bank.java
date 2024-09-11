import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Customer> customerList;


    public <T extends Account> T createAccount(AccountType type) {
        switch (type) {
            case SAVINGS_ACCOUNT:
                return (T) createSavingsAccount();
            case CHECKING_ACCOUNT:
                return (T) createCheckingAccount();
            default:
                throw new IllegalArgumentException("Unsupported account type");
        }
    }

    public SavingsAccount createSavingsAccount() {
        return new SavingsAccount(3);

    }

    public CheckingAccount createCheckingAccount() {
        return new CheckingAccount(500);
    }

    public void addACustomer(Customer customer) {
        customerList.add(customer);
    }

    public void removeAccount(Customer customer) {
        customerList.remove(customer);
    }


    public Bank(String name) {
        this.name = name;
        customerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getAccountsList() {
        return customerList;
    }


}
