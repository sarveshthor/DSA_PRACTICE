package DesignPatterns;

public class UPI implements PaymentStrategy{
    @Override
    public void doPayment() {
        System.out.println("Payment through UPI");
    }
}
