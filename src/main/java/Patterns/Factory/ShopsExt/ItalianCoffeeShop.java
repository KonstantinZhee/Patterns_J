package Patterns.Factory.ShopsExt;

import Patterns.Factory.CoffeType;
import Patterns.Factory.Coffee;
import Patterns.Factory.CoffeeExt.ItalianAmericano;
import Patterns.Factory.CoffeeExt.ItalianCappuccino;
import Patterns.Factory.CoffeeExt.ItalianLatte;
import Patterns.Factory.CoffeeShop;

public class ItalianCoffeeShop extends CoffeeShop {

    @Override
    public Coffee createCoffee(int number) {
        Coffee coffee;
        switch (number) {
            case 1 -> coffee = new ItalianAmericano();
            case 2 -> coffee = new ItalianCappuccino();
            case 3 -> coffee = new ItalianLatte();
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
        return coffee;
    }
}
