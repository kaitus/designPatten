package patterns.DecoratorDesignPattern.StringDecorator;

public class Demo {

    public static void main(String[] args) {
        MagicString s = new MagicString("paranguatirimicuaro");
        System.out.println(s + " has "
            + s.getNombreOfVowels() + " vowels");
    }
}
