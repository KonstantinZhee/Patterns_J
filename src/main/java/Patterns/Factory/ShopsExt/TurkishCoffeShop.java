package Patterns.Factory.ShopsExt;

import Patterns.Factory.Coffee;
import Patterns.Factory.CoffeeExt.TurkishAmericano;
import Patterns.Factory.CoffeeExt.TurkishCappuccino;
import Patterns.Factory.CoffeeExt.TurkishLatte;
import Patterns.Factory.CoffeeShop;

public class TurkishCoffeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(int number) {
        Coffee coffee;
        switch (number) {
            case 4 -> coffee = new TurkishAmericano();
            case 5 -> coffee = new TurkishCappuccino();
            case 6 -> coffee = new TurkishLatte();
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
        return coffee;
    }
}
