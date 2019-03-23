package patterns.DecoratorDesignPattern.QuizDecorator;

public class Demo {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(5);
        System.out.println("/****************/");
        System.out.println(dragon.crawl());
        System.out.println("/****************/");
        System.out.println(dragon.fly());
        System.out.println("/****************/");
        System.out.println(dragon.age);
    }
}
