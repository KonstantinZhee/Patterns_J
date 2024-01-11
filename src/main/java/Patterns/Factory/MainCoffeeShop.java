package Patterns.Factory;

public class MainCoffeeShop {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(new SimpleCoffeeFactory());
        coffeeShop.orderCoffee();
    }
}
