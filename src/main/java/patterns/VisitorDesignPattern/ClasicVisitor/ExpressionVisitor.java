package patterns.VisitorDesignPattern.ClasicVisitor;

public interface ExpressionVisitor {

    void visit(DoubleExpression e);

    void visit(AdditionExpression a);

}
