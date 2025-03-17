package Creational.FactoryPattern;

import Creational.VechileFactory;

public class FactoryPatternExample {
  public static void main(String[] args) {
    VechileInterface car = VechileFactory.getVehicle("Car");
    car.drive();

    VechileInterface bike = VechileFactory.getVehicle("Bike");
    bike.drive();
  }
}