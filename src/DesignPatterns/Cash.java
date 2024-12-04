package DesignPatterns;

public class Cash implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Payment through cash");
    }
}
