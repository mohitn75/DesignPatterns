package ObserverDesignPattern.Observers;

import ObserverDesignPattern.Subject.Subject;

public class Observer2 implements IObserver{

    public Observer2(Subject subject) {
        System.out.println("Observer2 has been added to the list of observers");
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer2 has been updated");
    }
}
