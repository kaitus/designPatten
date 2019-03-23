package patterns.ChainOfResponsabilityDesignPattern.MethodChain;

public class CreatureModefier {

    protected Creature creature;
    protected CreatureModefier next;

    public CreatureModefier(Creature creature) {
        this.creature = creature;
    }

    public void add(CreatureModefier cm) {
        if (next != null) {
            next.add(cm);
        } else {
            next = cm;
        }
    }

    public void handle() {
        if (next != null) next.handle();
    }
}
