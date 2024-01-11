package Patterns.Factory;

public abstract class CoffeeShop {

    public void orderCoffee (int number) {
        Coffee coffee = createCoffee(number);
            coffee.grindCoffee();
            coffee.makeCoffee();
            coffee.pourIntoCup();
            coffee.sayCoffeeType();
            System.out.println("TAKE YOUR F**ing COFFEE, PLZ");
    }
    public abstract Coffee createCoffee(int number);
}
