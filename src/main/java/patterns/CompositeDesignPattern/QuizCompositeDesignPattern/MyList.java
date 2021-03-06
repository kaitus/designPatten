package patterns.Composite.QuizCompositeDesignPattern;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {

    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }
    
    public int sum() {
        int result = 0;
        for (ValueContainer c :
                this) {
            for (int i :
                    c) {
                result += i;
            }
        }
        return result;
    }

    public static class Demo {
        SingleValue sv = new SingleValue(1);
    }
}
