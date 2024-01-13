package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Americano;
import Patterns.FactoryAbstract.CoffeProducts.Cappuccino;
import Patterns.FactoryAbstract.CoffeProducts.Coffee;

public interface FactoryCoffee {
    Coffee createAmericano();
    Coffee createCappuccino();
}
