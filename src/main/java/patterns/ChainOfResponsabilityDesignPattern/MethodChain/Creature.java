package patterns.ChainOfResponsabilityDesignPattern.MethodChain;

public class Creature {

    public String name;
    public int attack, deffense;

    public Creature(String name, int attack, int deffense) {
        this.name = name;
        this.attack = attack;
        this.deffense = deffense;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", deffense=" + deffense +
                '}';
    }
}
