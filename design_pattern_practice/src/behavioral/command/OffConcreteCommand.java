package behavioral.command;

public class OffConcreteCommand implements Command {

    private Light light;


    public OffConcreteCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
