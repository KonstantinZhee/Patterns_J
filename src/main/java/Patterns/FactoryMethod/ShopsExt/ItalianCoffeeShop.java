package Patterns.FactoryMethod.ShopsExt;

import Patterns.FactoryMethod.Coffee;
import Patterns.FactoryMethod.CoffeeExt.ItalianAmericano;
import Patterns.FactoryMethod.CoffeeExt.ItalianCappuccino;
import Patterns.FactoryMethod.CoffeeExt.ItalianLatte;
import Patterns.FactoryMethod.CoffeeShop;

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
