package Patterns.Creational.FactoryAbstract.Factories;

import Patterns.Creational.FactoryAbstract.CoffeProducts.AmericanoTurkish;
import Patterns.Creational.FactoryAbstract.CoffeProducts.CappuccinoTurkish;
import Patterns.Creational.FactoryAbstract.CoffeProducts.Coffee;

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
