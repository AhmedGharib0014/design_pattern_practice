package behavioral.observer;

public class Demo {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        Observer observer = new ObserverImpl();
        Observer observer2 = new ObserverImpl();

        subject.attach(observer);
        subject.attach(observer2);

        subject.setState("new thing");
    }
}
