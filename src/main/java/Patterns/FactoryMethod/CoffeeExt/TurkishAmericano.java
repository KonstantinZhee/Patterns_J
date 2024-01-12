package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class TurkishAmericano extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("TurkishAmericano");
    }
}
