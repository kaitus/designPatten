package patterns.FactoryDesignPattern.AbstracFactory;

public class Coffe implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("This coffe is delicious!");
    }
}
