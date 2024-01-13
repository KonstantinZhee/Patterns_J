package Patterns.Strategy.Strategy;

public class StandardStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Standard fill");
    }
}
