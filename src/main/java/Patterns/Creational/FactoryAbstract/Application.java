package Patterns.Creational.FactoryAbstract;

public class Application {
    public static void main(String[] args) {
        Service service = new Service();
        service.orderCoffee();
    }

}
