package Patterns.Creational.FactoryMethod;
import Patterns.Creational.FactoryMethod.ShopsExt.ItalianCoffeeShop;
import Patterns.Creational.FactoryMethod.ShopsExt.TurkishCoffeeShop;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class MainCoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeShop coffeeShop;
        while (scanner.hasNext()) {
            int number = 0;
            try {
                number = Integer.parseInt(scanner.next());
            } catch (NumberFormatException  e) {
                System.out.println("Enter number plz!");
                continue;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Перезапусти программу");
            }
            switch (number) {
                case 1, 2, 3 -> {
                    coffeeShop = new ItalianCoffeeShop();
                    coffeeShop.orderCoffee(number);
                }
                case 4, 5, 6 -> {
                    coffeeShop = new TurkishCoffeeShop();
                    coffeeShop.orderCoffee(number);
                }
                default -> System.out.println("Unexpected value: " + number);
            }
        }
    }
}
