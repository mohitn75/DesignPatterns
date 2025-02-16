package StrateagyDesignPattern.QuackBehaviourStrategy;

public class NoQuackConcreteStrategy implements QuackBehaviourStrategy {
    @Override
    public void quack() {
        System.out.println("SILENCE !!!");
    }
}
