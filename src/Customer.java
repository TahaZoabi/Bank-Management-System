import java.util.List;

public class Customer {
    private String name;
    private int customerID;
    private List<Account> accountsList;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
    }

    public void addAccount(Account account) {
        accountsList.add(account);
    }

    public void removeAccount(Account account) {
        accountsList.remove(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
