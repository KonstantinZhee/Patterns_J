package Patterns.Factory;

import Patterns.Factory.ShopsExt.ItalianCoffeeShop;
import Patterns.Factory.ShopsExt.TurkishCoffeShop;

import java.util.Scanner;

public class MainCoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeShop coffeeShop;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            switch (number) {
                case 1, 2, 3 -> {
                    coffeeShop = new ItalianCoffeeShop();
                    coffeeShop.orderCoffee(number);
                }
                case 4, 5, 6 -> {
                    coffeeShop = new TurkishCoffeShop();
                    coffeeShop.orderCoffee(number);
                }
                default -> throw new IllegalStateException("Unexpected value: " + number);
            }
        }
    }
}
