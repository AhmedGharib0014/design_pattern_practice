package behavioral.command;

public class commandDemo {

    public static void main(String[] args) {

        Light receiver = new Light();


        Switch invoker = new Switch();

        // commands
        Command onCommand = new OnConcreteCommand(receiver);

        Command offCommand = new OffConcreteCommand(receiver);

        Command BlinkCommand = new BlinkConcreteCommand(receiver);

        invoker.storeAndExecute(onCommand);

        invoker.storeAndExecute(offCommand);

        invoker.storeAndExecute(BlinkCommand);
    }

}
