package StrateagyDesignPattern.QuackBehaviourStrategy;

public class SqueakQuackConcreteStrategy implements QuackBehaviourStrategy {
    @Override
    public void quack() {
        System.out.println("SQUEAK !!!");
    }
}
