package Patterns.Creational.Pool.ObjectPool;

import Patterns.Creational.Pool.Object.NameGettable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ObjectPool<T extends NameGettable> implements Pool<T>, ObjFactory<T> {

    private int size;

    private boolean shutdown;

    private BlockingQueue<T> objects;

    public ObjectPool(int size) {
        System.out.println("Инициализация пула. Создание его полей.");
        this.size = size;
        shutdown = false;
        init();
    }

    /*
     * initiate the pool with fix size
     */
    private void init() {
        System.out.println("Инициализация очереди и добавление ресурсов в нее...");
        objects = new LinkedBlockingQueue<>();
        for (int i = 0; i < size; i++) {
            objects.add(createNew());
        }
    }

    @Override
    public T get() {
        if (!shutdown) {
            T t = null;
            try {
                t = objects.take();
                System.out.println("Забрали ресурс из очереди:\t" + t.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return t;
        }
        throw new IllegalStateException("Пул пустой!");
    }

    @Override
    public void release(T t) {
        try {
            System.out.println("Возвращаем ресурс в пул:\t" + t.getName());
            objects.offer(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shutdown() {
        System.out.println("Удаляем все ресурсы из пула. (не забываем закрыть ресурсы).");
        objects.clear();
    }
    public int size() {
        return objects.size();
    }

}