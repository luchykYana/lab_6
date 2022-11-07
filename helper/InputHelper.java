package helper;

import classes.Visitor;
import enums.PizzaEnum;

import java.util.List;
import java.util.Scanner;

public class InputHelper {
    public static String readConsole() {
        Scanner myObj = new Scanner(System.in);

        return myObj.nextLine();
    }

    public static String readConsole2() {
        DisplayHelper.printItem();

        Scanner myObj = new Scanner(System.in);
        String nameOfPizza = "";
        int n = myObj.nextInt(), i = 1;
        for (var pizza : PizzaEnum.values()) {
            if (n == i) {
                nameOfPizza = pizza.getName();
            }
            i++;
        }

        if (i <= n) {
            DisplayHelper.printItem("You choose incorrect number. Please, try again.");
            readConsole2();
        }

        return nameOfPizza;
    }

    public static Visitor readConsole3(List<Visitor> visitorList) {
        DisplayHelper.printItem2(visitorList);

        Scanner myObj = new Scanner(System.in);

        int n = myObj.nextInt(), i = 1;
        for (var item : visitorList) {
            if (n == i) {
                return item;
            }
            i++;
        }

        return null;
    }

    public static Visitor readConsole3_1(List<Visitor> visitorList) {
        var result = readConsole3(visitorList);

        while (result == null) {
            DisplayHelper.printItem("You choose incorrect number. Please, try again.");
            result = readConsole3_1(visitorList);
        }

        return result;
    }
}
