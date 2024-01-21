package Patterns.Behavioral.Observer.Example.ManytoMany.Subject;

public class RUNewsPublisher extends ObservablePublisher {

  @Override
  public void notifyObserver() {
    channels.forEach(ch -> ch.update(this, news));
  }

  protected void analyzingNews() {

    // Do some work with News

    // Notify our channels
    notifyObserver();
  }
}