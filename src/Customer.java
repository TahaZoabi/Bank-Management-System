import java.util.List;

public class Customer {
    private String name;

    private List<Account> accountsList;

    public Customer(String name) {
        this.name = name;
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


}
