package patterns.DecoratorDesignPattern.DinamicDecoration;

public class ColorShape implements Shape {

    private Shape shape;
    private String color;

    public ColorShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}
