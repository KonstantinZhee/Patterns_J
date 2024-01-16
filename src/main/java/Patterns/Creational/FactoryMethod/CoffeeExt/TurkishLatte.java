package Patterns.Creational.FactoryMethod.CoffeeExt;

import Patterns.Creational.FactoryMethod.Coffee;

public class TurkishLatte extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("TurkishLatte");
    }
}
