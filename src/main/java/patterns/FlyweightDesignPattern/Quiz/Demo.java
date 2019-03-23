package patterns.FlyweightDesignPattern.Quiz;

public class Demo {
    public static void main(String[] args) {
        Sentence s = new Sentence("this text is the example");
        System.out.println(s.getWord(0));
        System.out.println(s.getWord(1));
        System.out.println(s.getWord(2));
        System.out.println(s.toString());
    }
}
