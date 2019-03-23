package patterns.CommandDesignPattern.Command;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = new ArrayList<>();
        commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100));
        commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.WIDTHDRAW, 1000));

        for (BankAccountCommand c :
                commands) {
            c.call();
            System.out.println(ba);
        }

    }
}
