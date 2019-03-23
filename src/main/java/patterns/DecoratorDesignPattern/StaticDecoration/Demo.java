package patterns.DecoratorDesignPattern.StaticDecoration;

public class Demo {

    public static void main(String[] args) {
        ColoredSahpe<Square> blueSquare =
                new ColoredSahpe<>(
                        () -> new Square(20), "blue"
                );
        System.out.println(blueSquare.info());

        TransparentShape<ColoredSahpe<Circle>> myCircle =
                new TransparentShape<>(() ->
                        new ColoredSahpe<>(() -> new Circle(5), "green"), 50);
        System.out.println(myCircle.info());
    }
}
