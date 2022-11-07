package data;

import classes.Pizzeria;

import java.io.*;

public class PizzeriaSerializer {
    public static Pizzeria DeserializePizzeria() {
        System.out.println("Deserialize classes.Pizzeria");
        Pizzeria pizzeria = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("inputData.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            pizzeria = (Pizzeria) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("classes.Pizza not found");
            c.printStackTrace();
        }

        return pizzeria;
    }

    public static void SerializePizzeria(Pizzeria pizzeria, String fileName) {
        System.out.println("Serialize classes.Pizzeria");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            System.out.println(pizzeria);
            objectOutputStream.writeObject(pizzeria);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
