package Patterns.Factory;

import Patterns.Factory.Coffee;

public class Americano extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("Americano");
    }
}
