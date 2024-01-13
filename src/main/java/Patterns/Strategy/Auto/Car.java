package Patterns.Strategy.Auto;

import Patterns.Strategy.Strategy.FillStrategy;

public class Car {
    FillStrategy fillStrategy;
    public Car(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
    public void fill() {
        fillStrategy.fill();
    }
    public void gas() {
        System.out.println("GO");
    }
    public void stop() {
        System.out.println("STOP");
    }
}
