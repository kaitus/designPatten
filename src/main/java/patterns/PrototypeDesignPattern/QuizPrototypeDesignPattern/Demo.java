package patterns.PrototypeDesignPattern.QuizPrototypeDesignPattern;

public class Demo {
    public static void main(String[] args) {
        Point start = new Point(1,2);
        Point end = new Point(2,3);
        Line line = new Line(start, end);
        Line line2 = line.deepCopy();
        line2.start.x = 10;

        System.out.println("Line 1");
        System.out.println(line.start.x);
        System.out.println(line.start.y);
        System.out.println(line.end.x);
        System.out.println(line.end.y);
        System.out.println("Line 2");
        System.out.println(line2.start.x);
        System.out.println(line2.start.y);
        System.out.println(line2.end.x);
        System.out.println(line2.end.y);
    }
}
