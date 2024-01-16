package Patterns.Creational.Pool;

import Patterns.Creational.Pool.ObjectPool.ExpensiveResourcePool;
import Patterns.Creational.Pool.ObjectPool.ObjectPool;
import Patterns.Creational.Pool.Object.ExpensiveResource;

public class PoolAppEx1 {
    public static void main(String[] args) {
    final ExpensiveResourcePool pool = new ExpensiveResourcePool(3);
    System.out.println("********\nПростое использование:\n");
    getSize(pool);
    ExpensiveResource obj0 = pool.get();
    obj0.doSomething();
    getSize(pool);
    pool.release(obj0);
    getSize(pool);

    System.out.println("******\nМногопоточное использование\n");
    getSize(pool);
    ExpensiveResource obj1 = pool.get();
    ExpensiveResource obj2 = pool.get();
    ExpensiveResource obj3 = pool.get();
    getSize(pool);
    obj1.doSomething();
    obj2.doSomething();
    obj3.doSomething();
    System.out.println("\nСоздаем поток и симулируем долгую операцию для: " + obj1.getName());
    Runnable exec = () -> {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Наш объект закончил долгую операцию.");
        pool.release(obj1);
        getSize(pool);
        System.out.println("дождались выполнения четвертого запроса:");
    };
    Thread thread = new Thread(exec);
    System.out.println("Ждем, когда поток вернет объект в пул через 5 сек. Имя объекта: " + obj1.getName());
    thread.start();
    System.out.println("Запрашиваем еще объект из пула (четвертый запрос), но мы его сейчас не получим. Пока долгая операция не закончится:");
    getSize(pool);

    ExpensiveResource obj4 = pool.get(); //Эта команда будет ждать поток
    getSize(pool);
    obj4.doSomething();
    System.out.println("Четвертый запрос отработал и мы возвращаем все объекты в пул.");
    pool.release(obj4);
    pool.release(obj2);
    pool.release(obj3);
    getSize(pool);
    pool.shutdown();
    getSize(pool);
}
 static void getSize(ObjectPool objectPool){
    System.out.println("ОБЪЕКТОВ В ПУЛЕ: " +  objectPool.size() + "\n");

}

}