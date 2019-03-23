package patterns.CommandDesignPattern.Command;

public class BankAccountCommand implements Command{

    private BankAccount account;

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
                account.deposit(amount);
                break;
            case WIDTHDRAW:
                account.widthdraw(amount);
                break;
        }
    }
}
