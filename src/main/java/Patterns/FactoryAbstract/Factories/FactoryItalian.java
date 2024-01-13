package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.AmericanoItalian;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;
import Patterns.FactoryAbstract.CoffeProducts.CappuccinoItalian;
import Patterns.FactoryAbstract.CoffeProducts.Coffee;

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
