package patterns.SingletonDesignPattern.StaticBlockSingleton;

import java.io.File;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws Exception {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton instance;

    static  {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.err.println("fail to create singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
