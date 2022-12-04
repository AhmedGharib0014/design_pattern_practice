package behavioral.command;

public class BlinkConcreteCommand implements Command{

    private Light light;

    public BlinkConcreteCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.blink();
    }
}
