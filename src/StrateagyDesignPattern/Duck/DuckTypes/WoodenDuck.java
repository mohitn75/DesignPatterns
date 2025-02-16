package StrateagyDesignPattern.Duck.DuckTypes;

import StrateagyDesignPattern.FlyBehaviourStrategy.NoFlyConcreteStrategy;
import StrateagyDesignPattern.QuackBehaviourStrategy.NoQuackConcreteStrategy;
import StrateagyDesignPattern.Duck.Duck;

public class WoodenDuck extends Duck {

    public WoodenDuck(){
        super(new NoQuackConcreteStrategy(), new NoFlyConcreteStrategy());
    }



}
