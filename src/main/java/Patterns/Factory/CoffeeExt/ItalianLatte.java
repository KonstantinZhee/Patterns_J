package Patterns.Factory.CoffeeExt;

import Patterns.Factory.Coffee;

public class ItalianLatte extends Coffee {
    @Override
    public void sayCoffeeType() {
        System.out.println("ItalianLatte");
    }
}
