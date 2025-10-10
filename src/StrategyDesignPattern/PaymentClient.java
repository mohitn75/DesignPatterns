package StrategyDesignPattern;

import StrategyDesignPattern.Payment.Payment;
import StrategyDesignPattern.PaymentStrategies.CreditCardPayment;
import StrategyDesignPattern.PaymentStrategies.IPayment;
import StrategyDesignPattern.PaymentStrategies.UPIPayment;

public class PaymentClient {


    public static void main(String[] args) {

        Payment pay = new Payment(new CreditCardPayment());

        pay.getDetails();
        pay.pay();

        pay = new Payment(new UPIPayment());

        pay.getDetails();
        pay.pay();

    }
}
