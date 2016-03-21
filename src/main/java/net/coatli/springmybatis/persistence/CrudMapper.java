package net.coatli.springmybatis.persistence;

import java.util.List;

/**
 * Base supertype for CRUD mappers.
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudMapper<T,K> {

  public int create(T type);

  public T read(K key);

  public int update(T type);

  public int delete(T type);

  public List<T> readAll(T type);

}
