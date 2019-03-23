package patterns.AdapterDesignPatten.VectorRasterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    private final static List<VectorObject> vectorObjects
            = new ArrayList<>(Arrays.asList(
              new VectorRectangle(1,1,10,10),
              new VectorRectangle(3,3,6,6)
    ));

    public static void drawPoint(Point p) {
        System.out.println(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line: vo) {
                LineToPiontAdapter adapter = new LineToPiontAdapter(line);
                adapter.forEach(Demo::drawPoint);

            }
        }
    }

    public static void main(String[] args) {
    draw();
    draw();
    }

}
