package Patterns.Pool.ObjectPool;

import Patterns.Pool.Object.ExpensiveResource;

import java.util.UUID;

public class ExpensiveResourcePool  extends ObjectPool<ExpensiveResource> {

    public ExpensiveResourcePool(int size) {
        super(size);
        System.out.println("Создание пула и наполнение его ресурсами завершено. Выход из конструктора ExpensiveResourcePool");
    }

    @Override
    public ExpensiveResource createNew() {
        System.out.println("Создание ресурса...");
        return new ExpensiveResource(String.valueOf(UUID.randomUUID().hashCode()));
    }

}