package patterns.ProxyDesignPattern.ProtectionProxy;

public class Demo {

    public static void main(String[] args) {
        Car car = new CarProxy(new Driver(20));
        car.drive();
    }
}
