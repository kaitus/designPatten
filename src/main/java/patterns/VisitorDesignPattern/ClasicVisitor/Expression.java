package patterns.VisitorDesignPattern.ClasicVisitor;

abstract class Expression {

    public abstract void accept(ExpressionVisitor visitor);
}
