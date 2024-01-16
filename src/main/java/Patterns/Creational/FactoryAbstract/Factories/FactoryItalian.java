package Patterns.Creational.FactoryAbstract.Factories;

import Patterns.Creational.FactoryAbstract.CoffeProducts.AmericanoItalian;
import Patterns.Creational.FactoryAbstract.CoffeProducts.Coffee;
import Patterns.Creational.FactoryAbstract.CoffeProducts.CappuccinoItalian;

public class FactoryItalian implements FactoryCoffee{
    @Override
    public Coffee createAmericano() {
        return new AmericanoItalian();
    }

    @Override
    public Coffee createCappuccino() {
        return new CappuccinoItalian();
    }
}
