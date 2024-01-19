package Patterns.Structural.Bridge.Example;

import Patterns.Structural.Bridge.Example.Devices.Device;
import Patterns.Structural.Bridge.Example.Devices.Radio;
import Patterns.Structural.Bridge.Example.Devices.TV;
import Patterns.Structural.Bridge.Example.RemoteControllers.NewConsole;
import Patterns.Structural.Bridge.Example.RemoteControllers.PrimitiveConsole;
import Patterns.Structural.Bridge.Example.RemoteControllers.TouchScreen;

public class Ex {

  public static void main(String[] args) {
    Device tv = new TV();
    Device radio = new Radio();

    TouchScreen touchScreen = new TouchScreen(tv);
    NewConsole newConsole = new NewConsole(tv);
    PrimitiveConsole primitiveConsole = new PrimitiveConsole(radio);

    touchScreen.power();
    touchScreen.changeChanel();
    touchScreen.changeChanel();
    newConsole.changeChanel();
    newConsole.mute();

    primitiveConsole.power();
    primitiveConsole.changeChanel();

    //We can do now with radio
    NewConsole newConsole1 = new NewConsole(radio);
    newConsole1.mute();
  }
}
