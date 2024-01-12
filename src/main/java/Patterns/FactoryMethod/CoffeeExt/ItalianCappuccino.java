package Patterns.FactoryMethod.CoffeeExt;

import Patterns.FactoryMethod.Coffee;

public class ItalianCappuccino extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianCappuccino");
    }
}
