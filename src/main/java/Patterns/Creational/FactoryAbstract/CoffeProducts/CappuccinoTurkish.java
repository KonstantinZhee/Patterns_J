package Patterns.Creational.FactoryAbstract.CoffeProducts;

public class CappuccinoTurkish extends Coffee implements Cappuccino{
    @Override
    public void smell() {
        System.out.println("Вкусно пахнет Турецким Капучино.");
    }
}
