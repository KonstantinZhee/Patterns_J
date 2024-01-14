package Patterns.Pool;

import Patterns.Pool.Object.ExpensiveResource;
import Patterns.Pool.ObjectPool.ExpensiveResourcePool;

public class PoolAppEx1 {
    public static void main(String[] args) {
    final ExpensiveResourcePool pool = new ExpensiveResourcePool(3);

    System.out.println("Simple usage");
    System.out.println();
    System.out.println("Pool size:" + pool.size());

    /* simple usage - get the object */
    ExpensiveResource obj0 = pool.get();
    /* simple usage - use the object */
    obj0.doSomething();

    /* to check that the object was removed from the pool */
    System.out.println("Pool size:" + pool.size());

    /* simple usage - return the object */
    pool.release(obj0);

    System.out.println();
    System.out.println("extended usage");
    System.out.println();

    ExpensiveResource obj1 = pool.get();
    ExpensiveResource obj2 = pool.get();
    ExpensiveResource obj3 = pool.get();

    /* to check that the object was removed from the pool */
    System.out.println("Pool size:" + pool.size());
    obj1.doSomething();
    obj2.doSomething();
    obj3.doSomething();

    /* create a new thread to simulate the long operation for obj1 - this will avoid blocking the test app */
    Runnable exec = () -> {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.release(obj1);
    };
    Thread thread = new Thread(exec);
    thread.start();

    /* will wait until the thread will finish and will return the object to the pool - 5 sec
     * will be the same object as for obj1.
     */
    System.out.println("Pool size:" + pool.size());
    ExpensiveResource obj4 = pool.get();
    obj4.doSomething();

    /*return all objects to the pool */
    pool.release(obj4);
    pool.release(obj2);
    pool.release(obj3);

    /* check the pool size */
    System.out.println("Pool size:" + pool.size());

    /* shutdown the pool*/
    pool.shutdown();

    /* check the pool size */
    System.out.println("Pool size:" + pool.size());
}

}