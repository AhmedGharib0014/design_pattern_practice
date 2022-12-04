package behavioral.command;


//receiver
public class OnConcreteCommand implements Command {

    public Light light;

    public OnConcreteCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }


}
