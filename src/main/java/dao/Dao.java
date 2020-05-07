package dao;
import java.util.*;

public interface Dao<T, K>  {

    T create(T entity);

    T findById(int id);

    List<T> findByKeyL(K key);

  //  T findByKey(K key);

    List<T> findAll();

    void update(T entity);

    void delete(T object);

    void deleteAll();

}
