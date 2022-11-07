package classes;

import enums.PizzaEnum;

import java.io.Serializable;
import java.util.List;

public class Pizza implements Serializable {
    private final String name;
    private final int weight;
    private final int price;
    private final List<String> ingredients;

    public Pizza(PizzaEnum pizza, int weight, int price) {
        this.name = pizza.getName();
        this.weight = weight;
        this.price = price;
        this.ingredients = pizza.getIngredients();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\tclasses.Pizza{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", ingredients=" + ingredients +
                "}";
    }
}
