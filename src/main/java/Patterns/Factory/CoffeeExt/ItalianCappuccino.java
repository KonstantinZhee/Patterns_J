package Patterns.Factory.CoffeeExt;

import Patterns.Factory.Coffee;

public class ItalianCappuccino extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianCappuccino");
    }
}
