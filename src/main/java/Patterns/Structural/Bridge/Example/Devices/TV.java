package Patterns.Structural.Bridge.Example.Devices;

public class TV implements Device {

  private int volume = 0;
  private int channel = 0;
  private boolean enable = false;

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void nextChannel() {
    System.out.println("Next channel on TV");
    channel += 1;
  }

  @Override
  public boolean isEnable() {
    return enable;
  }

  @Override
  public void disable() {
    enable = false;
  }

  @Override
  public void enable() {
    enable = true;
  }
}
