import classes.Pizzeria;
import data.PizzeriaSerializer;
import helper.DisplayHelper;
import helper.InputHelper;

public class Menu {
    public static void start() {
        Pizzeria pizzeria = null;

        while (true) {
            DisplayHelper.start();

            String choice = InputHelper.readConsole();

            switch (choice) {
//                case "1" -> pizzeria = data.DataManager.getMockData();
                case "1" -> pizzeria = PizzeriaSerializer.DeserializePizzeria();
                case "2" -> PizzeriaSerializer.SerializePizzeria(pizzeria, "outputData.ser");
                case "3" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task1();
                }
                case "4" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task2();
                }
                case "5" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task3();
                }
                case "6" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task4();
                }
                case "7" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task5();
                }
                case "8" -> {
                    if (pizzeria == null) {
                        System.out.println("classes.Pizzeria = null. Please, choose 1 in menu");
                        break;
                    }
                    pizzeria.Task6();
                }
                case "9" -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Not correct. Try again");
            }
        }
    }
}
