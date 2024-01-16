package Patterns.Creational.FactoryAbstract.Factories;

import Patterns.Creational.FactoryAbstract.CoffeProducts.Coffee;

public interface FactoryCoffee {
    Coffee createAmericano();
    Coffee createCappuccino();
}
