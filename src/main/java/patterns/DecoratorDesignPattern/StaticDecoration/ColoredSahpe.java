package patterns.DecoratorDesignPattern.StaticDecoration;

import java.util.function.Supplier;

public class ColoredSahpe <T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColoredSahpe(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}
