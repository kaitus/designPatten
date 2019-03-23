package patterns.ChainOfResponsabilityDesignPattern.BrokerChain;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.quieries.subcribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Query.Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }
}
