package StrateagyDesignPattern.Duck;

import StrateagyDesignPattern.QuackBehaviourStrategy.QuackBehaviourStrategy;
import StrateagyDesignPattern.FlyBehaviourStrategy.FlyBehaviourStrategy;

public class Duck {

    QuackBehaviourStrategy quackBehaviourStrategy;
    FlyBehaviourStrategy flyBehaviour;

    public Duck(QuackBehaviourStrategy quackBehaviourStrategy, FlyBehaviourStrategy flyBehaviourStrategy){
        this.quackBehaviourStrategy = quackBehaviourStrategy;
        this.flyBehaviour = flyBehaviourStrategy;
    }

    public void performQuack(){
        quackBehaviourStrategy.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setQuackBehaviourStrategy(QuackBehaviourStrategy quackBehaviourStrategy){
        this.quackBehaviourStrategy = quackBehaviourStrategy;
    }

}
