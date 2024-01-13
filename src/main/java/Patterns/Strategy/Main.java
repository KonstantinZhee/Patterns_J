package Patterns.Strategy;

import Patterns.Strategy.Auto.Car;
import Patterns.Strategy.Auto.ElectroCar;
import Patterns.Strategy.Auto.StandardCar;

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
