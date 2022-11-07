package data;

import classes.*;
import enums.PizzaEnum;

import java.time.LocalDateTime;
import java.util.List;

public class DataManager {
    public static Pizzeria getMockData() {

        var pizza1_small = new Pizza(PizzaEnum.HAWAIIAN, 592, 235);
        var pizza1_large = new Pizza(PizzaEnum.HAWAIIAN, 815, 293);

        var pizza2_small = new Pizza(PizzaEnum.FIVE_CHEESES, 530, 261);
        var pizza2_large = new Pizza(PizzaEnum.FIVE_CHEESES, 703, 312);

        var pizza3_small = new Pizza(PizzaEnum.TONY_PEPPERONI, 530, 230);
        var pizza3_large = new Pizza(PizzaEnum.TONY_PEPPERONI, 740, 293);

        var pizza4_small = new Pizza(PizzaEnum.MARGHERITA, 552, 235);
        var pizza4_large = new Pizza(PizzaEnum.MARGHERITA, 800, 293);

        var pizza5_small = new Pizza(PizzaEnum.TUSCAN, 556, 279);
        var pizza5_large = new Pizza(PizzaEnum.TUSCAN, 745, 322);

        var pizza6_small = new Pizza(PizzaEnum.CARBONARA, 525, 261);
        var pizza6_large = new Pizza(PizzaEnum.CARBONARA, 708, 312);

        var order1 = new OrderList(1, LocalDateTime.of(2022, 11, 4, 3, 20, 0),
                List.of(new Order(pizza1_large, 1),
                        new Order(pizza2_large, 2)
                ));
        var order2 = new OrderList(2, LocalDateTime.of(2022, 11, 4, 3, 10, 0),
                List.of(new Order(pizza1_small, 1),
                        new Order(pizza2_small, 1),
                        new Order(pizza3_small, 1)
                ));
        var order3 = new OrderList(3, LocalDateTime.of(2022, 11, 4, 2, 10, 0),
                List.of(new Order(pizza4_small, 1),
                        new Order(pizza5_small, 2),
                        new Order(pizza6_small, 1)
                ));
        var order4 = new OrderList(4, LocalDateTime.of(2022, 11, 4, 2, 20, 0),
                List.of(new Order(pizza4_large, 1),
                        new Order(pizza6_large, 2)
                ));
        var order5 = new OrderList(5, LocalDateTime.of(2022, 11, 4, 3, 40, 0),
                List.of(new Order(pizza3_large, 3),
                        new Order(pizza5_large, 2)
                ));
        var order6 = new OrderList(6, LocalDateTime.of(2022, 11, 4, 2, 30, 0),
                List.of(new Order(pizza4_large, 2)
                ));
        var order7 = new OrderList(7, LocalDateTime.of(2022, 11, 4, 3, 30, 0),
                List.of(new Order(pizza1_large, 1)
                ));
        var order8 = new OrderList(8, LocalDateTime.of(2022, 11, 4, 2, 40, 0),
                List.of(new Order(pizza4_large, 1),
                        new Order(pizza1_small, 2),
                        new Order(pizza2_large, 1)
                ));

        var visitor1 = new Visitor(1, "Lviv 1", List.of(order1, order4));
        var visitor2 = new Visitor(2, "Lviv 2", List.of(order3));
        var visitor3 = new Visitor(3, "Lviv 3", List.of(order2, order6));
        var visitor4 = new Visitor(4, "Lviv 4", List.of(order5));
        var visitor5 = new Visitor(5, "Lviv 5", List.of(order7));
        var visitor6 = new Visitor(6, "Lviv 6", List.of(order8));

        Pizzeria pizzeria = new Pizzeria(List.of(pizza1_small, pizza1_large, pizza2_small, pizza2_large, pizza3_small, pizza3_large,
                pizza4_small, pizza4_large, pizza5_small, pizza5_large, pizza6_small, pizza6_large),
                List.of(visitor1, visitor2, visitor3, visitor4, visitor5, visitor6));

        PizzeriaSerializer.SerializePizzeria(pizzeria, "inputData.ser");

        return pizzeria;
    }
}
