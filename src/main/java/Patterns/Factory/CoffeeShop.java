package Patterns.Factory;

import java.util.Scanner;

public class CoffeeShop {

    private final SimpleCoffeeFactory simpleCoffeeFactory;
    public CoffeeShop(final SimpleCoffeeFactory coffeeFactory) {
        this.simpleCoffeeFactory = coffeeFactory;
    }
    public void orderCoffee () {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            Coffee coffee = simpleCoffeeFactory.createCoffee(enterCoffee(number));
            coffee.grindCoffee();
            coffee.makeCoffee();
            coffee.pourIntoCup();
            coffee.sayCoffeeType();
            System.out.println("TAKE YOUR F**ing COFFEE, PLZ");
        }
    }
    private CoffeType enterCoffee( int number){
        CoffeType coffeType = null;
        switch (number) {
            case 1 -> {
               coffeType = CoffeType.AMERICANO;
            }
            case 2 -> {
                coffeType = CoffeType.CAPPUCCINO;
            }
            case 3 -> {
                coffeType = CoffeType.LATTE;
            }
        }
        return coffeType;
    }
}
