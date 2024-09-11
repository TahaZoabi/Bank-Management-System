import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> customerList;


    public Account createAccount(AccountType type) {
        if (type == AccountType.SAVINGS_ACCOUNT) {
            return new SavingsAccount(3);
        }
        return new CheckingAccount(500);
    }
    

    public Bank(String name) {
        this.name = name;
        customerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Client> getCustomerList() {
        return customerList;
    }


}
