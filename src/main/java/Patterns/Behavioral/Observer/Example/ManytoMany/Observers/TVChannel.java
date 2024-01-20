package Patterns.Behavioral.Observer.Example.ManytoMany.Observers;

import Patterns.Behavioral.Observer.Example.ManytoMany.Subject.ObservablePublisher;
import Patterns.Behavioral.Observer.Example.ManytoMany.Subject.RUNewsPublisher;
import Patterns.Behavioral.Observer.Example.ManytoMany.Subject.UANewsPublisher;

public class TVChannel implements Observer {

  @Override
  public void update(ObservablePublisher observablePublisher, String news) {
    if (observablePublisher instanceof RUNewsPublisher) {
      System.out.println("TV shows that - " + news + "says Russia");
    } else if (observablePublisher instanceof UANewsPublisher) {
      System.out.println("TV shows that - " + news + "says Ukraine");
    }
  }
}
