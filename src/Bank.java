import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> customerList;

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
