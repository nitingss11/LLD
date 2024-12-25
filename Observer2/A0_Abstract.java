package Observer2;

import java.util.ArrayList;
import java.util.List;

public abstract class A0_Abstract implements A_Subject {
    
    List<B_Observer> observers = new ArrayList<>();

    public void addObserver(B_Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(B_Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(B_Observer observer : observers) {
            observer.update(this);
        }
    }

}
