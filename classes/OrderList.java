package classes;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class OrderList implements Serializable {
    private final int id;
    private final LocalDateTime desiredTime;
    private final List<Order> orders;

    public OrderList(int id, LocalDateTime desiredTime, List<Order> orders) {
        this.id = id;
        this.desiredTime = desiredTime;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDesiredTime() {
        return desiredTime;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "\n\t\tOrderList{" +
                "id=" + id +
                ", desiredTime=" + desiredTime +
                ", orders=" + orders +
                '}';
    }
}
