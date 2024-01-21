package Patterns.Behavioral.Mediator.Example.Ex2.Components.Sensors;

import Patterns.Behavioral.Mediator.Example.Ex2.Mediator.Mediator;

public abstract class Sensor {

  protected Mediator mediator;

  public Sensor(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void sens();
}
