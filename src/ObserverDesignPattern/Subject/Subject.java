package ObserverDesignPattern.Subject;

import ObserverDesignPattern.Observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject, IObserver{

    public static Subject subject;
    private List<IObserver> observers;

    private Subject() {
        this.observers = new ArrayList<>();
    }

    public static Subject createSubject() {
        if(subject != null) {
            return subject;
        }
        return new Subject();
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void getObservers() {
        for (IObserver observer : observers) {
            System.out.println(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void update() {

    }
}
