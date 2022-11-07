package classes;

import enums.PizzaEnum;
import helper.DisplayHelper;
import helper.InputHelper;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Pizzeria implements Serializable {
    List<Pizza> pizzaList;
    List<Visitor> visitorList;

    public Pizzeria(List<Pizza> pizzaList, List<Visitor> visitorList) {
        this.pizzaList = pizzaList;
        this.visitorList = visitorList;
    }

    public void Task1() {
        var orders = visitorList.stream().map(Visitor::getOrders).flatMap(List::stream).toList();
        var result = orders.stream().sorted(Comparator.comparing(OrderList::getDesiredTime)).toList();

        DisplayHelper.printTask1(result);
    }

    public void Task2() {
        var addresses = visitorList.stream()
                .filter(x -> x.getOrders().stream()
                        .map(OrderList::getOrders)
                        .anyMatch(z -> z.size() > 2 ||
                                (z.size() > 1 && z.stream().anyMatch(u -> u.getNumber() > 1)) ||
                                z.stream().anyMatch(u -> u.getNumber() > 2)))
                .map(Visitor::getAddress).toList();

        DisplayHelper.printItem(addresses);
    }

    public void Task3() {
        String choice = InputHelper.readConsole2();
        DisplayHelper.printItem("You choose '" + choice + "'");

        var result = visitorList.stream()
                .filter(x -> x.getOrders().stream()
                        .anyMatch(y -> y.getOrders().stream()
                                .anyMatch(z -> Objects.equals(z.getPizza().getName(), choice))))
                .toList();

        DisplayHelper.printTask3(result, choice);
    }

    public void Task4() {
        Visitor choice = InputHelper.readConsole3_1(visitorList);
        DisplayHelper.printItem("You choose classes.Visitor #" + choice.getId() + ". " + choice.getAddress());

        var orders = choice.getOrders().stream().map(OrderList::getOrders).flatMap(List::stream).toList();
        var max = orders.stream().map(Order::getNumber).max(Integer::compare).get();
        var result = orders.stream().filter(x -> x.getNumber() == max).toList();

        DisplayHelper.printTask5(choice, result);
    }

    public void Task5() {
        HashMap<String, List<Visitor>> task5 = new HashMap<>();

        for (var pizza : PizzaEnum.values()) {
            var value = visitorList.stream()
                    .filter(x -> x.getOrders().stream()
                            .anyMatch(y -> y.getOrders().stream()
                                    .anyMatch(z -> Objects.equals(z.getPizza().getName(), pizza.getName()))))
                    .toList();
            task5.put(pizza.getName(), value);
        }

        DisplayHelper.printTask5(task5);
    }

    public void Task6() {
        var orders = visitorList.stream().map(Visitor::getOrders).flatMap(List::stream).toList();
        var currentDate = LocalDateTime.of(2022, 11, 4, 3, 10, 0);

        var notCompleted = orders.stream().filter(x -> currentDate.isAfter(x.getDesiredTime())).toList();
        var result = notCompleted.stream()
                .collect(Collectors.toMap(x -> x, y -> Duration.between(y.getDesiredTime(), currentDate)));
        DisplayHelper.printTask6(result);
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "pizzaList=" + pizzaList +
                ", visitorList=" + visitorList +
                '}';
    }
}
