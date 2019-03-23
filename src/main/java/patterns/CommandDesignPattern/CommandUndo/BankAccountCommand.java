package patterns.CommandDesignPattern.CommandUndo;

public class BankAccountCommand implements Command{

    private BankAccount account;
    private boolean successed;

    public enum Action {
        DEPOSIT, WIDTHDRAW
    }

    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                successed = true;
                account.deposit(amount);
                break;
            case WIDTHDRAW:
                successed = account.widthdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {
        if (!successed) return;
        switch (action) {
            case DEPOSIT:
                account.widthdraw(amount);
                break;
            case WIDTHDRAW:
                account.deposit(amount);
                break;
        }
    }
}
