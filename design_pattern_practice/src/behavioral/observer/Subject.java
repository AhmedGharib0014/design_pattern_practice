package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {

    protected String state;

    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    abstract public void setState(String state);

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyListeners() {

        observers.forEach(ob->ob.update(state));

    }

}
