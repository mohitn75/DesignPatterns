package StrateagyDesignPattern.QuackBehaviourStrategy;

public class ActualQuackConcreteStrategy implements QuackBehaviourStrategy {
    @Override
    public void quack() {
        System.out.println("QUACK !!!");
    }
}
