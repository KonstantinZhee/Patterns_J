package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.AmericanoTurkish;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;
import Patterns.FactoryAbstract.CoffeProducts.CappuccinoTurkish;

public class FactoryTurkish implements FactoryCoffee{
    @Override
    public Americano createCoffee() {
        return new AmericanoTurkish();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new CappuccinoTurkish();
    }
}
