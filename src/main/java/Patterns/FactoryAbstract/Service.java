package Patterns.FactoryAbstract;

import Patterns.FactoryAbstract.CoffeProducts.Coffee;
import Patterns.FactoryAbstract.Factories.FactoryItalian;
import Patterns.FactoryAbstract.Factories.FactoryTurkish;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    public void orderCoffee() {
        while (scanner.hasNext()) {
            System.out.println(Constants.QUESTION_FIRST);
            int coffeeShop = readAnswer();
            System.out.println(Constants.QUESTION_SECOND);
            int coffeeType = readAnswer();
            CoffeeMaker coffeeMaker = getCoffeeMaker(coffeeShop);
            Coffee coffee = null;
            switch (coffeeType) {
                case 1 -> coffee = coffeeMaker.makeCappuccino();
                case 2 -> coffee = coffeeMaker.makeAmericano();
                default -> System.out.println("Нет такого типа кофе.");
            }
            if (coffee != null) {
                coffee.makeCoffee();
                coffee.smell();
            }
        }
    }

    private CoffeeMaker getCoffeeMaker(int coffeeShop) {
        switch (coffeeShop){
            case 1 -> {
                return new CoffeeMaker(new FactoryItalian());
            }
            case 2 -> {
                return new CoffeeMaker(new FactoryTurkish());
            }
            default -> System.out.println("Нет такой фабрики кофе.");
        }
        return null;
    }

    private int readAnswer() {
        scanner = new Scanner(System.in);
        int number = 0;
        while (scanner.hasNext()) {
            try {
                number = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Enter number plz!");
                continue;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Перезапусти программу");
            }
            if (number == 1 || number == 2) {
                break;
            }
        }
        return number;
    }


}