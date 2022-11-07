package helper;

import classes.Order;
import classes.OrderList;
import classes.Visitor;
import enums.PizzaEnum;
import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayHelper {
    public static void start() {
        System.out.println("\nSelect an input type:");
        System.out.println("1. Deserialize data");
        System.out.println("2. Serialise data");
        System.out.println("3. Task 1");
        System.out.println("4. Task 2");
        System.out.println("5. Task 3");
        System.out.println("6. Task 4");
        System.out.println("7. Task 5");
        System.out.println("8. Task 6");
        System.out.println("9. Exit");
    }

    public static void printTask1(List<OrderList> orders) {
        System.out.println("Result Task 1");
        for (var order : orders) {
            System.out.println("id: " + order.getId() + " | time: " + order.getDesiredTime());
        }
    }

    public static void printTask3(List<Visitor> orders, String name) {
        System.out.println("Result Task 3");
        System.out.println("Pizza with name '" + name + "' buy " + orders.size() + " customers");
        for (var order : orders) {
            System.out.println("id: " + order.getId() + " | orders: " + order.getOrders());
        }
    }

    public static void printTask5(Visitor visitor, List<Order> orders) {
        System.out.println("Result Task 5");
        System.out.println("Visitor #" + visitor.getId() + " " + visitor.getAddress() + " has " + orders.size() + " favourite item(s)");

        for (var key : orders) {
            System.out.println(key.getPizza().getName() + " " + key.getNumber() + " times");
        }
    }

    public static void printTask5(HashMap<String, List<Visitor>> list) {
        System.out.println("Result Task 5");
        for (var key : list.keySet()) {
            System.out.println("key: " + key);
            for (var item: list.get(key)) {
                System.out.println("\tvisitor: " + item.getId() + ". ");
//                for (var item2: item.getOrders()) {
//                    for (var item3: item2.getOrders()) {
//                        System.out.println("\t\t" + item3.getPizza().getName());
//                    }
//                }
            }
        }
    }

    public static void printTask6(Map<OrderList, Duration> res) {
        System.out.println("Result Task 6");

        res.forEach((x, y) -> System.out.println("Order id: " + x.getId() + " Extension time: " + y.toMinutes()));
    }

    public static void printItem(List<String> item) {
        System.out.println("Result Task 2");
        System.out.println(item);
    }

    public static void printItem(String item) {
        System.out.println(item);
    }

    public static void printItem() {
        System.out.println("Choose pizza: ");
        int i = 1;
        for (var pizza : PizzaEnum.values()) {
            System.out.println(i + ". " + pizza.getName());
            i++;
        }
    }

    public static void printItem2(List<Visitor> visitors) {
        System.out.println("Choose visitor: ");
        int i = 1;
        for (var visitor : visitors) {
            System.out.println(i + ". Visitor #" + visitor.getId() + ". " + visitor.getAddress());
            i++;
        }
    }
}
