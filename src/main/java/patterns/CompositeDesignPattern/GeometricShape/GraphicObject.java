package patterns.Composite.GeometricShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {

    protected String name = "Group";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GraphicObject() {
    }

    public String color;

    public List<GraphicObject> children = new ArrayList<>();

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        print(sb, 0);
        return sb.toString();
    }

    private void print(StringBuffer stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((color == null || color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        for (GraphicObject child :
                children) {
            child.print(stringBuilder, depth + 1);
        }
    }
}
