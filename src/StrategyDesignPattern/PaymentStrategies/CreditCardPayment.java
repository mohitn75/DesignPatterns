package StrategyDesignPattern.PaymentStrategies;

public class CreditCardPayment implements IPayment{
    @Override
    public void getDetails() {
        System.out.println("Take Credit Card details");
    }

    @Override
    public void makePayment() {
        System.out.println("Make payment via Credit Card");
    }
}
