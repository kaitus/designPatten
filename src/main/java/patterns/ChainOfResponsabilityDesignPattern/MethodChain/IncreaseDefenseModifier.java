package patterns.ChainOfResponsabilityDesignPattern.MethodChain;

public class IncreaseDefenseModifier extends CreatureModefier {

    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + "'s defense");
        creature.deffense += 3;
        super.handle();
    }
}
