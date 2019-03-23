package patterns.ChainOfResponsabilityDesignPattern.MethodChain;

public class DoubleAttackModifier extends CreatureModefier {

    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.name + "'s attack");
        creature.attack *= 2;
        super.handle();
    }
}
