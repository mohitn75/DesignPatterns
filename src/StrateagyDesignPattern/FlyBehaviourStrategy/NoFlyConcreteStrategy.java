package StrateagyDesignPattern.FlyBehaviourStrategy;

public class NoFlyConcreteStrategy implements FlyBehaviourStrategy {
    @Override
    public void fly() {
        System.out.println("Can't fly \n");
    }
}
