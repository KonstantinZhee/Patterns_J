package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class TurkishLatte extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("TurkishLatte");
    }
}
