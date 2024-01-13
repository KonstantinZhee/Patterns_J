package Patterns.FactoryAbstract.CoffeProducts;

public class AmericanoTurkish extends Coffee implements Americano {
    @Override
    public void smell() {
        System.out.println("Вкусно пахнет Турецким Американо.");
    }
}