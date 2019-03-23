package patterns.ChainOfResponsabilityDesignPattern.MethodChain;

public class NoBonusesModifier extends CreatureModefier {

    public NoBonusesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("No bonuses for you!");
    }
}
