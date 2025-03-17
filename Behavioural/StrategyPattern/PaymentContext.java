package Behavioural.StrategyPattern;

public class PaymentContext {
  private PaymentStrategy strategy;

  public void setPaymentStrategy(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  public void executePayment(int amount) {
    if (strategy == null) {
      throw new IllegalStateException("Payment strategy is not set.");
    }
    strategy.pay(amount);
  }
}
