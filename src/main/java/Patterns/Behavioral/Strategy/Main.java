package Patterns.Behavioral.Strategy;

import Patterns.Behavioral.Strategy.Auto.Car;
import Patterns.Behavioral.Strategy.Auto.ElectroCar;
import Patterns.Behavioral.Strategy.Auto.StandardCar;

public class Main {
    public static void main(String[] args) {
        Car carEl = new ElectroCar();
        Car carSt = new StandardCar();
        carSt.fill();
        carSt.gas();
        carSt.stop();
        carEl.fill();
        carEl.gas();
        carEl.stop();
    }
}
