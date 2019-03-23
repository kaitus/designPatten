package patterns.FactoryDesignPattern.AbstracFactory;

public class Demo {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }

}
