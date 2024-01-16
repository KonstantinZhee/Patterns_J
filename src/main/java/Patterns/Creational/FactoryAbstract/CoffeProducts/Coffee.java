package Patterns.Creational.FactoryAbstract.CoffeProducts;

public class Coffee implements Smellable{
    public void makeCoffee(){
        System.out.println("Кофе сварен.");
    }
    @Override
    public void smell() {
        System.out.println("Вкусно пахнет кофе.");
    }
}
