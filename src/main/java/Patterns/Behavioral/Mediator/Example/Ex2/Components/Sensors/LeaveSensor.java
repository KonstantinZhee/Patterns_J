package Patterns.Behavioral.Mediator.Example.Ex2.Components.Sensors;

import Patterns.Behavioral.Mediator.Example.Ex2.Mediator.Mediator;

public class LeaveSensor extends Sensor {

  public LeaveSensor(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void sens() {
    mediator.notify("Leave");
  }
}
