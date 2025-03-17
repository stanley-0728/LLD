package Behavioural.StrategyPattern;

public class Main {
  public static void main(String[] args) {
    PaymentContext context = new PaymentContext();

    context.setPaymentStrategy(new CreditPayment());
    context.executePayment(1000);

    context.setPaymentStrategy(new PayPalPayment());
    context.executePayment(500);

    context.setPaymentStrategy(new UpiPayment());
    context.executePayment(200);
  }
}
