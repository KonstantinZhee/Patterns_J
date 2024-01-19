package Patterns.Structural.Bridge.Example.RemoteControllers;

import Patterns.Structural.Bridge.Example.Devices.Device;

public class NewConsole extends RemoteController {

  public NewConsole(Device device) {
    super(device);
  }

  @Override
  public void changeChanel() {
    System.out.println("Click button");
    device.nextChannel();
  }

  public void mute() {
    device.setVolume(0);
  }
}
