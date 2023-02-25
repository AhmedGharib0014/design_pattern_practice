package behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConcreteSubject  extends Subject{



    private Deque<String> queue = new ArrayDeque<>();

    @Override
    public void setState(String state) {

        queue.add(state);
        this.state = state;
        notifyListeners();
    }
}
