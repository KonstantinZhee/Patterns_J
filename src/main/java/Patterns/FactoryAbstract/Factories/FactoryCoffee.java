package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;

public interface FactoryCoffee {
    Americano createCoffee();
    Cappuccino createCappuccino();
}
