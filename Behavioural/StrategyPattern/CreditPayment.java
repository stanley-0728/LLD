package Behavioural.StrategyPattern;

public class CreditPayment implements PaymentStrategy {
  @Override
  public void pay(double amount) {
    // TODO Auto-generated method stub
    System.out.println("Paid " + amount + " using Credit Card.");
  }
}
