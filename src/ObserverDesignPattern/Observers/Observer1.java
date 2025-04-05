package ObserverDesignPattern.Observers;

import ObserverDesignPattern.Subject.Subject;

public class Observer1 implements IObserver{

    public Observer1(Subject subject) {
        System.out.println("Observer1 has been added to the list of observers");
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer1 has been updated");
    }
}
