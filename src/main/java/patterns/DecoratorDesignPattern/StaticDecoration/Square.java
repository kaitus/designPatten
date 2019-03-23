package patterns.DecoratorDesignPattern.StaticDecoration;

public class Square implements Shape{

    private float side;

    public Square() {
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A Square of side " + side;
    }
}
