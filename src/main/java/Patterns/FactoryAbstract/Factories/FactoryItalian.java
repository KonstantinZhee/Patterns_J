package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.AmericanoItalian;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;
import Patterns.FactoryAbstract.CoffeProducts.CappuccinoItalian;

public class FactoryItalian implements FactoryCoffee{
    @Override
    public Americano createCoffee() {
        return new AmericanoItalian();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new CappuccinoItalian();
    }
}
