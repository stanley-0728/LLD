1. Definition
The Factory Pattern is a creational design pattern that provides an interface for creating objects but lets subclasses decide which class to instantiate.
It helps in decoupling object creation logic from the client.

2. Real-World Analogy
Think of a car manufacturing factory. You don’t manually build a car—you place an order for a specific type (SUV, Sedan, Truck), and the factory produces it for you.
The customer (client) doesn’t worry about how the car is built, just about getting the right car.

3. Problem Without the Factory Pattern
Without using the Factory Pattern, object creation is directly tied to the client code.

Example: Creating Vehicles Without a Factory

class Car {
    void drive() { System.out.println("Driving a Car!"); }
}

class Bike {
    void drive() { System.out.println("Riding a Bike!"); }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // Direct object creation
        car.drive();

        Bike bike = new Bike(); // Direct object creation
        bike.drive();
    }
}

4. Issues with this approach:
 1. Violates Open/Closed Principle → Every time we add a new vehicle, we modify the main code.

 2. Tight Coupling → The client is directly dependent on specific classes (Car, Bike).

 3. Code Duplication → If another part of the system also needs to create vehicles, the logic is repeated.

 4. Difficult to manage object creation logic → If the initialization of objects changes, we need to modify every place where they are instantiated.

 4. Solution Using the Factory Pattern
The Factory Pattern encapsulates object creation into a separate class so that the client doesn’t need to worry about how objects are created.

5. UML Diagram
plaintext
Copy
Edit
        +--------------------+
        |    VehicleFactory  |
        |--------------------|
        | + getVehicle(type) |
        +--------+----------+
                 |
  --------------------------------
  |                              |
+------------+            +------------+
|    Car     |            |    Bike    |
|------------|            |------------|
| + drive()  |            | + drive()  |
+------------+            +------------+

6. Where to Use the Factory Pattern?
When object creation logic is complex and should be centralized.
When we need to hide implementation details from the client.
When we need to return different subclasses based on conditions.
