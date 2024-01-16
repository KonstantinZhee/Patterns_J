package Patterns.Behavioral.Strategy.Auto;

import Patterns.Behavioral.Strategy.Strategy.ElectroStrategy;

public class ElectroCar extends Car {
    public ElectroCar(){
        super(new ElectroStrategy());
//        this.fillStrategy = new ElectroStrategy();
    }
}
