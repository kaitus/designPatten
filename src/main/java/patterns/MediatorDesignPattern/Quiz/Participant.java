package patterns.MediatorDesignPattern.Quiz;

public class Participant {

    private Mediator mediator;
    public int value;

    public Participant(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.addListener(this);
    }

    public void say(int n)
    {
        mediator.broadcast(this, n);
    }

    public void notify(Object sender, int n)
    {
        if (sender != this)
            value += n;
    }
}
