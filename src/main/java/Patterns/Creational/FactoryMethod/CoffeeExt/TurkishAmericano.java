package Patterns.Creational.FactoryMethod.CoffeeExt;

import Patterns.Creational.FactoryMethod.Coffee;

public class TurkishAmericano extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("TurkishAmericano");
    }
}
