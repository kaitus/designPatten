package patterns.InterpreterDesignPattern.HandMadeInterpreterLexing;

public class Token {

    public enum Type {
        INTEGER,
        PLUS,
        MINIMUS,
        LPAREN,
        RPAREN
    }

    public Type type;
    public String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}
