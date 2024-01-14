package Patterns.Pool.ObjectPool;

import Patterns.Pool.Object.ExpensiveResource;

import java.util.UUID;

public class ExpensiveResourcePool  extends ObjectPool<ExpensiveResource> {

    public ExpensiveResourcePool(int size) {
        super(size);
    }

    @Override
    public ExpensiveResource createNew() {
        //return an object with random name
        return new ExpensiveResource(UUID.randomUUID().toString());
    }

}