package Patterns.Creational.FactoryMethod.ShopsExt;
import Patterns.Creational.FactoryMethod.CoffeeExt.ItalianAmericano;
import Patterns.Creational.FactoryMethod.CoffeeExt.ItalianCappuccino;
import Patterns.Creational.FactoryMethod.CoffeeExt.ItalianLatte;
import Patterns.Creational.FactoryMethod.Coffee;
import Patterns.Creational.FactoryMethod.CoffeeShop;
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
