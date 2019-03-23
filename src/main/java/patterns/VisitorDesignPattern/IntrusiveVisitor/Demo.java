package patterns.VisitorDesignPattern.IntrusiveVisitor;

public class Demo {

    public static void main(String[] args) {
        AdditionExpression e = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2), new DoubleExpression(3)));
        StringBuilder sb = new StringBuilder();
        e.print(sb);
        System.out.println(sb);
    }
}
