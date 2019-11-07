package com.example.sysparking.Patrones;

public interface IRespositorio<T> {
    T create(T t);
    void delete(T t);
    T find(T t);
    T update(T t);

    Iterable<T> findAll();
}
