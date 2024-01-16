package Patterns.Creational.FactoryAbstract;

import Patterns.Creational.FactoryAbstract.CoffeProducts.Coffee;
import Patterns.Creational.FactoryAbstract.Factories.FactoryCoffee;

public class CoffeeMaker {
    private final FactoryCoffee factoryCoffee;

    public CoffeeMaker(FactoryCoffee factoryCoffee) {
        this.factoryCoffee = factoryCoffee;
    }
    public Coffee makeAmericano(){
        System.out.println("Делаю Американо.");
        return factoryCoffee.createAmericano();
    }
    public Coffee makeCappuccino(){
        System.out.println("Делаю Капучино.");
        return factoryCoffee.createCappuccino();
    }
}
