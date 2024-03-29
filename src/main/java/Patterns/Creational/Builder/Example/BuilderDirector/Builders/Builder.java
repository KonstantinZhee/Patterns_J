package Patterns.Creational.Builder.Example.BuilderDirector.Builders;

import Patterns.Creational.Builder.Example.BuilderDirector.Object.House;

public interface Builder {

  void setWall(int wall);

  void setFoundation();

  void setWindow(int window);

  void setRoof();

  void setDoor(int door);

  House getHouse();
}
