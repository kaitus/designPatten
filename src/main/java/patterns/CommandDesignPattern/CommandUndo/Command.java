package patterns.CommandDesignPattern.CommandUndo;

public interface Command {

    void call();

    void undo();
}
