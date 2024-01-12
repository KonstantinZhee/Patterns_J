package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class ItalianAmericano extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianAmericano");
    }
}
