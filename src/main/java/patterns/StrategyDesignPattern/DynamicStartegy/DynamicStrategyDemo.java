package patterns.StrategyDesignPattern.DynamicStartegy;

import com.sun.tools.javac.util.List;

public class DynamicStrategyDemo {

    public static void main(String[] args)
    {
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(
                MarkdownListStrategy::new);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(tp2);
    }
}
