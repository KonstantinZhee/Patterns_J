package Patterns.Pool.Object;

public class ExpensiveResource implements NameGettable {
    private String name;

    public ExpensiveResource(String name) {
        this.name = name;
        try {
            Thread.sleep(1000);
            System.out.println("Конкретный ресурс создан: " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() {
    }
    @Override
    public String getName() {
        return name;
    }
}