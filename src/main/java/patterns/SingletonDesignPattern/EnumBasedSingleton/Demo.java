package patterns.SingletonDesignPattern.EnumBasedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
    static void saveToFile(EnumBasedSingleton singleton,
                           String filename) throws Exception {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws Exception {
        try(FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        String filename = "myfile.bin";
        //EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
        //singleton.setValue(111);
        //saveToFile(singleton, filename);

        EnumBasedSingleton singleton1 = readFromFile(filename);
        System.out.println(singleton1.getValue());
    }
}
