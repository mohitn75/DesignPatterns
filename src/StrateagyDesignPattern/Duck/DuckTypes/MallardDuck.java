package StrateagyDesignPattern.Duck.DuckTypes;

import StrateagyDesignPattern.FlyBehaviourStrategy.FlyWithWingsConcreteStrategy;
import StrateagyDesignPattern.QuackBehaviourStrategy.ActualQuackConcreteStrategy;
import StrateagyDesignPattern.Duck.Duck;


public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new ActualQuackConcreteStrategy(), new FlyWithWingsConcreteStrategy());
    }

}
