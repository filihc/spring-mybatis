package net.coatli.springmybatis.persistence;

/**
 * Base supertype for CRUD mappers.
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudMapper<T,ID> {

  public int create(T type);

  public T read(ID key);

  public int update(T type);

  public int delete(T type);

}
