import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Customer> customerList;


    public void createAccount(Customer customer, AccountType type) {
        Account newAccount = null;
        if (type.equals(AccountType.SAVINGS_ACCOUNT)) {
            newAccount = new SavingsAccount(0);
        }
        newAccount = new CheckingAccount(1);
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
