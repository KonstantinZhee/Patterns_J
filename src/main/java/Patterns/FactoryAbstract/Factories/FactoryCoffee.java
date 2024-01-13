package Patterns.FactoryAbstract.Factories;

import Patterns.FactoryAbstract.CoffeProducts.Coffee;

public interface FactoryCoffee {
    Coffee createAmericano();
    Coffee createCappuccino();
}
