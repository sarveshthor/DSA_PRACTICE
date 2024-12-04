package DesignPatterns;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(String s){
        switch (s){
            case "UPI" : {
                return new UPI();
            }

            case "Cash" : {
                return new Cash();
            }

            default : {
                System.out.println("Not valid");
            }
        }
        return new UPI();
    }
}
