package Patterns.FactoryMethod.ShopsExt;

import Patterns.FactoryMethod.Coffee;
import Patterns.FactoryMethod.CoffeeExt.TurkishAmericano;
import Patterns.FactoryMethod.CoffeeExt.TurkishCappuccino;
import Patterns.FactoryMethod.CoffeeExt.TurkishLatte;
import Patterns.FactoryMethod.CoffeeShop;

public class TurkishCoffeeShop extends CoffeeShop {
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
