package Patterns.Creational.Pool.ObjectPool;

public interface ObjFactory<T> {

    //Создаем объект ресурса.
    T createNew();
}