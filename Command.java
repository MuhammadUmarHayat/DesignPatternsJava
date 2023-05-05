public interface Command 
{
    void execute();
}

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

public interface Receiver {
    void action();
}
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
// main
public static void main(String[] args) {
    Receiver receiver = new ConcreteReceiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker();

    invoker.setCommand(command);
    invoker.executeCommand();
}
