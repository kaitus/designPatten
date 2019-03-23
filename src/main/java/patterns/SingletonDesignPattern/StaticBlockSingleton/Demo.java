package patterns.SingletonDesignPattern.StaticBlockSingleton;

public class Demo {

    public static void main(String[] args) throws Exception {
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        System.out.println(singleton);
    }

}
