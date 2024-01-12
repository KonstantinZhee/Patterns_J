package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class TurkishCappuccino extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("TurkishCappuccino");
    }
}
