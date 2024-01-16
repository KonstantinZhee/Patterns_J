package Patterns.Creational.Pool.ObjectPool;

import Patterns.Creational.Pool.Object.NameGettable;

public interface Pool <T extends NameGettable> {

    //Взять ресурс из пула
    T get();

    //Возврат дорогого ресурса в пул
    void release(T object);

    //Отключить пул (пропиши отключение ресурсов)
    void shutdown();
}