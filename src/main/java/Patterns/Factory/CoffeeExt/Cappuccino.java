package Patterns.Factory.CoffeeExt;

import Patterns.Factory.Coffee;

public class Cappuccino extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("Cappuccino");
    }
}
