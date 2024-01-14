package Patterns.Pool.ObjectPool;

public interface ObjFactory<T> {

    /**
     * Returns a new instance of an object type T.
     *
     * @return T a new instance of the object type T
     */
    T createNew();
}