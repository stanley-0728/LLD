package Creational;

import Creational.FactoryPattern.Bike;
import Creational.FactoryPattern.Car;
import Creational.FactoryPattern.VechileInterface;

public class VechileFactory {
  public static VechileInterface getVehicle(String type) {
    if (type.equalsIgnoreCase("Car")) {
      return new Car();
    } else if (type.equalsIgnoreCase("Bike")) {
      return new Bike();
    }
    throw new IllegalArgumentException("Invalid vehicle type: " + type);
  }
}
