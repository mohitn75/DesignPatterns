package StrategyDesignPattern.Payment;

import StrategyDesignPattern.PaymentStrategies.IPayment;

public class Payment {

    public IPayment payment;

    public Payment(IPayment payment){
        this.payment = payment;
    }

    public void getDetails(){
        payment.getDetails();
    }

    public void pay(){
        payment.makePayment();
    }

}
