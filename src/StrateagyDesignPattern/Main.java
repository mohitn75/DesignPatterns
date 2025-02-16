package StrateagyDesignPattern;

import StrateagyDesignPattern.Duck.DuckTypes.MallardDuck;
import StrateagyDesignPattern.Duck.DuckTypes.RubberDuck;
import StrateagyDesignPattern.Duck.DuckTypes.WoodenDuck;
import StrateagyDesignPattern.Duck.Duck;
import StrateagyDesignPattern.QuackBehaviourStrategy.NoQuackConcreteStrategy;

public class Main {
    public static void main(String[] args) {

        /*
        Strategy -
         defines a family of algorithms. encapsulates each one, and makes them interchangeable.
         Strategy lets the algorithm vary independently from the clients that use it.
        */


        Duck mallardDuck = new MallardDuck();  // up-casting of a sub-class to super-class
        mallardDuck.performQuack();
        mallardDuck.setQuackBehaviourStrategy(new NoQuackConcreteStrategy());
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.performQuack();
        woodenDuck.performFly();

    }
}
