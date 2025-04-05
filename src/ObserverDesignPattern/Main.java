package ObserverDesignPattern;

import ObserverDesignPattern.Observers.Observer1;
import ObserverDesignPattern.Observers.Observer2;
import ObserverDesignPattern.Subject.Subject;

public class Main {


    public static void main(String[] args)  {

        Subject subject = Subject.createSubject();

        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);

        subject.getObservers();

        subject.notifyObservers();

    }

}
