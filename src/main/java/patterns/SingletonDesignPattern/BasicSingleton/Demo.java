package patterns.SingletonDesignPattern.BasicSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    static void saveToFile(BasicSingleton singleton,
                           String filename) throws Exception {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try(FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        //Problem #1. Reflection
        //Problem #2. Serialization

        //Class #1 singleton design pattern
        //BasicSingleton singleton = BasicSingleton.getInstance();
        //singleton.setValue(1233333);
        //System.out.println(singleton.getValue());

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String filename = "singleton.bin";
        saveToFile(singleton, filename);

        singleton.setValue(222);

        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singleton == singleton2);

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
