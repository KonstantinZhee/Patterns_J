package Patterns.Factory;

import Patterns.Factory.CoffeExtenders.Americano;
import Patterns.Factory.CoffeExtenders.Cappuccino;
import Patterns.Factory.CoffeExtenders.Latte;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(final CoffeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO -> coffee = new Americano();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case LATTE -> coffee = new Latte();
        }
            System.out.println("Кофе сварен.");
        return coffee;
    }
}
