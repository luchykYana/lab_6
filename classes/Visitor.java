package classes;

import java.io.Serializable;
import java.util.List;

public class Visitor implements Serializable {
    private final int id;
    private final String address;
    private final List<OrderList> orders;

    public Visitor(int id, String address, List<OrderList> orders) {
        this.id = id;
        this.address = address;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public List<OrderList> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "\n\tclasses.Visitor{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                "}\n";
    }
}
