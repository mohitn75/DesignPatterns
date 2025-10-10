package StrategyDesignPattern.PaymentStrategies;

public class UPIPayment implements IPayment{
    @Override
    public void getDetails() {
        System.out.println("Take UPI details");
    }

    @Override
    public void makePayment() {
        System.out.println("Make payment via UPI");
    }
}
