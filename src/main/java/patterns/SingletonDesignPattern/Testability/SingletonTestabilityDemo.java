package patterns.SingletonDesignPattern.Testability;

public class SingletonTestabilityDemo {

    public static void main(String[] args) {
        SingletonDatabase db = SingletonDatabase.getInstance();

        String city = "Tokyo";
        int pop = db.getPopulation(city);
        System.out.println(
                String.format("%s has population %d", city, pop)
        );
    }
}
