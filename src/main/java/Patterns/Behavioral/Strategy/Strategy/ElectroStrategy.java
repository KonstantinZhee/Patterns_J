package Patterns.Behavioral.Strategy.Strategy;

public class ElectroStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Electric fill");
    }
}