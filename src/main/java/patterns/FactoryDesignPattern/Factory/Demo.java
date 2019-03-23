package patterns.FactoryDesignPattern.Factory;

public class Demo {

    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(3, 4);
        System.out.println(point.getClass());
    }

}
