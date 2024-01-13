package Patterns.FactoryMethod;

public abstract class CoffeeShop {
    public void orderCoffee (int number) {
        Coffee coffee = createCoffee(number);
            coffee.grindCoffee();
            coffee.makeCoffee();
            coffee.pourIntoCup();
            coffee.sayCoffeeType();
            System.out.println("Возьмите ваш кофе, пожалуйста!");
    }
    public abstract Coffee createCoffee(int number);
}
