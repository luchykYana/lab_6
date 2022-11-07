package classes;

import java.io.Serializable;

public class Order implements Serializable {
    private final Pizza pizza;
    private final int number;

    public Order(Pizza pizza, int number) {
        this.pizza = pizza;
        this.number = number;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\n\t\t\tOrder{" +
                "pizza=" + pizza +
                ", number=" + number +
                '}';
    }
}
