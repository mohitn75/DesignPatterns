package StrateagyDesignPattern.FlyBehaviourStrategy;

public class FlyWithWingsConcreteStrategy implements FlyBehaviourStrategy {
    @Override
    public void fly() {
        System.out.println("Real Flying \n");
    }
}
