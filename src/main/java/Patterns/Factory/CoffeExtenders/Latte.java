package Patterns.Factory.CoffeExtenders;

import Patterns.Factory.Coffee;

public class Latte extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("Latte");
    }
}
