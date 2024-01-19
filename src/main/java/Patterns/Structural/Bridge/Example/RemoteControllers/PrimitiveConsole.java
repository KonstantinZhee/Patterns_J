package Patterns.Structural.Bridge.Example.RemoteControllers;

import Patterns.Structural.Bridge.Example.Devices.Device;

public class PrimitiveConsole extends RemoteController {

  public PrimitiveConsole(Device device) {
    super(device);
  }

  @Override
  public void changeChanel() {
    System.out.println("Twist the wheel");
    device.nextChannel();
  }
}
