package com.refactorizando.patterns.builder;

public interface Builder {

  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setWheels(int wheels);
  void setLeatherSeats(Boolean leatherSeats);
  void setBatteries(int batteries);
  void setConvertible(Boolean convertible);
  void setElectricCar(Boolean electricCar);
}
