package patterns.VisitorDesignPattern.AcycliVisitor;

public interface AdditionExpressionVisitor extends Visitor {

    void visit(AdditionExpression obj);

}
