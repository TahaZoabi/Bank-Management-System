import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private List<Customer> customerList;


    public Account createAccount(AccountType type) {
        if (type == AccountType.SAVINGS_ACCOUNT) {
            return new SavingsAccount(3);
        }
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
