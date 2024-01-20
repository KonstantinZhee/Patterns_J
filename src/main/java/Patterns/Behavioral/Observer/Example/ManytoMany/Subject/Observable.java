package Patterns.Behavioral.Observer.Example.ManytoMany.Subject;

import Patterns.Behavioral.Observer.Example.ManytoMany.Observers.Observer;

//Interface for Publisher
//If we have one Publisher we need only Interface

public interface Observable {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver();
}
