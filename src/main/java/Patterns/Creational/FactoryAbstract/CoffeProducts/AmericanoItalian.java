package Patterns.Creational.FactoryAbstract.CoffeProducts;

public class AmericanoItalian extends Coffee implements Americano{
    @Override
    public void smell() {
        System.out.println("Вкусно пахнет Итальянским Американо.");
    }
}