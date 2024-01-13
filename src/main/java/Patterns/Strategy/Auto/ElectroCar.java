package Patterns.Strategy.Auto;

import Patterns.Strategy.Strategy.ElectroStrategy;

public class ElectroCar extends Car {
    public ElectroCar(){
        super(new ElectroStrategy());
//        this.fillStrategy = new ElectroStrategy();
    }
}
