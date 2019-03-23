package patterns.FactoryDesignPattern.AbstracFactory;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    public enum AvailableDrink
    {
        COFFEE, TEA
    }

    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {

        Set<Class<? extends IHotDrinkFactory>> types = new Reflections("patterns.FactoryDesignPattern.AbstracFactory").getSubTypesOf(IHotDrinkFactory.class);
        for (Class<? extends IHotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public IHotDrink makeDrink() throws Exception {
        System.out.println("Available drink:");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, IHotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amout;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()) {
                System.out.println("Specify amount:");
                s = reader.readLine();
                if (s != null && (amout = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue().prepare(amout);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
