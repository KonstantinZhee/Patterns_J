package Patterns.Behavioral.Strategy.Auto;

import Patterns.Behavioral.Strategy.Strategy.StandardStrategy;

public class StandardCar extends Car {
    public StandardCar() {
        super(new StandardStrategy());
//        this.fillStrategy = new StandardStrategy();
    }
}
