package Patterns.FactoryAbstract.CoffeProducts;

public class CappuccinoItalian extends Coffee implements Cappuccino {
    @Override
    public void smell() {
        System.out.println("Вкусно пахнет Итальянским Капучино.");
    }
}