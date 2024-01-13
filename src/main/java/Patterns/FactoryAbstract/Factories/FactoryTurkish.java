package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.AmericanoTurkish;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;
import Patterns.FactoryAbstract.CoffeProducts.CappuccinoTurkish;
import Patterns.FactoryAbstract.CoffeProducts.Coffee;

public class FactoryTurkish implements FactoryCoffee{
    @Override
    public Coffee createAmericano() {
        return new AmericanoTurkish();
    }

    @Override
    public Coffee createCappuccino() {
        return new CappuccinoTurkish();
    }
}
