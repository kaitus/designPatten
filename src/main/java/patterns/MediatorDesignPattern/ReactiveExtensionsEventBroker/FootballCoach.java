package patterns.MediatorDesignPattern.ReactiveExtensionsEventBroker;

public class FootballCoach {

    public FootballCoach(EventBroker broker)
    {
        broker.subscribe(i -> {
            System.out.println("Hey, you scored " + i + " goals!");
        });
    }
}
