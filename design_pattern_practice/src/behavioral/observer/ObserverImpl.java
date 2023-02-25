package behavioral.observer;

public class ObserverImpl implements Observer {
    @Override
    public void update(String state) {

        System.out.println(this + state);

    }
}
