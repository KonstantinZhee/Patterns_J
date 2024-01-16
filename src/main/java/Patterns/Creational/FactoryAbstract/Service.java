package Patterns.Creational.FactoryAbstract;

import Patterns.Creational.FactoryAbstract.CoffeProducts.Coffee;
import Patterns.Creational.FactoryAbstract.Factories.FactoryItalian;
import Patterns.Creational.FactoryAbstract.Factories.FactoryTurkish;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    public void orderCoffee() {
        while (scanner.hasNext()) {
            System.out.println(Constants.QUESTION_FIRST);
            int coffeeShop = readAnswer();
            System.out.println(Constants.QUESTION_SECOND);
            int coffeeType = readAnswer();
            Optional<CoffeeMaker> coffeeMakerOptional = getCoffeeMaker(coffeeShop);
            if(coffeeMakerOptional.isPresent()) {
                CoffeeMaker coffeeMaker = coffeeMakerOptional.get();
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
    }

    private Optional<CoffeeMaker> getCoffeeMaker(int coffeeShop) {
        switch (coffeeShop){
            case 1 -> {
                return Optional.of(new CoffeeMaker(new FactoryItalian()));
            }
            case 2 -> {
                return Optional.of(new CoffeeMaker(new FactoryTurkish()));
            }
            default -> System.out.println("Нет такой фабрики кофе.");
        }
        return Optional.empty();
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
            } else {
                System.out.println("Введите, 1 или 2.");
            }
        }
        return number;
    }


}