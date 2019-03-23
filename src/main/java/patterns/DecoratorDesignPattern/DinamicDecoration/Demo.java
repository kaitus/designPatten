package patterns.DecoratorDesignPattern.DinamicDecoration;

public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("object circle #1");
        System.out.println(circle.info());

        ColorShape blueSquare = new ColorShape(new Square(20), "blue");
        System.out.println("\nobject blueSquare #2");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColorShape(new Circle(5), "green"), 50);
        System.out.println("\nobject myCircle #3");
        System.out.println(myCircle.info());
    }
}
