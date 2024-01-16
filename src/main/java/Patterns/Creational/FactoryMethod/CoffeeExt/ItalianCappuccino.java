package Patterns.Creational.FactoryMethod.CoffeeExt;

import Patterns.Creational.FactoryMethod.Coffee;

public class ItalianCappuccino extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianCappuccino");
    }
}
