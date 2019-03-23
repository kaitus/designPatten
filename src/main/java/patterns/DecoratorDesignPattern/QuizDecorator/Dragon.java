package patterns.DecoratorDesignPattern.QuizDecorator;

public class Dragon {

    public int age;
    public Bird bird = new Bird();
    public Lizard lizard = new Lizard();

    public void setAge(int age) {
        this.age = bird.age = lizard.age = age;
    }

    public String fly(){
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}
