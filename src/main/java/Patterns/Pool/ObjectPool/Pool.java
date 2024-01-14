package Patterns.Pool.ObjectPool;

import Patterns.Pool.Object.NameGettable;

public interface Pool <T extends NameGettable> {

    //Взять ресурс из пула
    T get();

    //Возврат дорогого ресурса в пул
    void release(T object);

    //Отключить пул (пропиши отключение ресурсов)
    void shutdown();
}