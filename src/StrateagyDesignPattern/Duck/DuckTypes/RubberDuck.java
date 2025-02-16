package StrateagyDesignPattern.Duck.DuckTypes;

import StrateagyDesignPattern.FlyBehaviourStrategy.NoFlyConcreteStrategy;
import StrateagyDesignPattern.QuackBehaviourStrategy.SqueakQuackConcreteStrategy;
import StrateagyDesignPattern.Duck.Duck;

public class RubberDuck extends Duck {

    public RubberDuck(){
        super(new SqueakQuackConcreteStrategy(), new NoFlyConcreteStrategy());
    }

}
