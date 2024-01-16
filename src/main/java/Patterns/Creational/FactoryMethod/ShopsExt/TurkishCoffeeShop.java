package Patterns.Creational.FactoryMethod.ShopsExt;
import Patterns.Creational.FactoryMethod.Coffee;
import Patterns.Creational.FactoryMethod.CoffeeExt.TurkishAmericano;
import Patterns.Creational.FactoryMethod.CoffeeExt.TurkishCappuccino;
import Patterns.Creational.FactoryMethod.CoffeeExt.TurkishLatte;
import Patterns.Creational.FactoryMethod.CoffeeShop;

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
