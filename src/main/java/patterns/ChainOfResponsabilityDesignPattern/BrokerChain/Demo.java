package patterns.ChainOfResponsabilityDesignPattern.BrokerChain;

public class Demo {
    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong goblin", 2, 2);
        System.out.println(goblin);

        IncreaseDefenseModifier icm = new IncreaseDefenseModifier(game, goblin);

        try (DoubleAttackModifier dam
                     = new DoubleAttackModifier(game, goblin))
        {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}
