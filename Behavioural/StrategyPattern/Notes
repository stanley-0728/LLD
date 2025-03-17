Strategy Pattern

1.Real-World Analogy
Imagine a payment system in an e-commerce platform. A user should be able to pay using Credit Card, PayPal, or UPI. Instead of hardcoding payment logic for each method inside a single class, we allow the user to pick a payment strategy dynamically.

2.Problems Without Strategy Pattern
Without applying the Strategy Pattern, we would likely implement payment logic inside a monolithic class using if-else or switch statements:

class PaymentProcessor {
    void processPayment(String type) {
        if (type.equals("CreditCard")) {
            // Credit card payment logic
        } else if (type.equals("PayPal")) {
            // PayPal payment logic
        } else if (type.equals("UPI")) {
            // UPI payment logic
        }
    }
}
3.Issues:
Violates Open/Closed Principle – Every time we add a new payment method, we modify this class.
Code Duplication – If similar logic is needed elsewhere, it gets duplicated.
Hard to Maintain & Extend – Any change in one payment method might break others.
Unit Testing is Difficult – Testing each case requires altering internal logic.

4.What Strategy Pattern Solves
Encapsulates behaviors (strategies) into separate classes instead of conditionals.
Allows adding new behaviors (payment methods) without modifying existing code.
Improves maintainability by keeping each strategy focused on a single responsibility.
Enhances flexibility by letting users select strategies dynamically.


5. UML Diagram for Strategy Pattern
Here’s the UML representation of the Strategy Pattern:

+--------------------+      +----------------------+      +----------------------+
|      Context       | ---> |      Strategy        | <--- |    ConcreteStrategy  |
| - strategy: Strategy |      | + execute()         |      | + execute()          |
| + setStrategy()     |      +----------------------+      +----------------------+
| + executeStrategy() |
+--------------------+

6. Where to Use the Strategy Pattern?
When you have multiple algorithms for a task and want to select one dynamically.
When you avoid if-else or switch statements for different behaviors.
When a class has too many behaviors that need to be decoupled
