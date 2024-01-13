package Patterns.Strategy.Auto;

import Patterns.Strategy.Strategy.StandardStrategy;

public class StandardCar extends Car {
    public StandardCar() {
        super(new StandardStrategy());
//        this.fillStrategy = new StandardStrategy();
    }
}
