package Patterns.Pool.ObjectPool;

public interface ObjFactory<T> {

    //Создаем объект ресурса.
    T createNew();
}