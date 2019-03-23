package patterns.ChainOfResponsabilityDesignPattern.Quiz;

public class StatQuery {

    public Statistic statistic;
    public int result;

    public StatQuery(Statistic statistic)
    {
        this.statistic = statistic;
    }

}
