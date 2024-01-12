package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class ItalianLatte extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianLatte");
    }
}
