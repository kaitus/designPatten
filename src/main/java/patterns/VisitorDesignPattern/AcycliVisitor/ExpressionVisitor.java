package patterns.VisitorDesignPattern.AcycliVisitor;

public interface ExpressionVisitor extends Visitor {

    void visit(Expression obj);
}
