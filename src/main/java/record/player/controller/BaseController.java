package record.player.controller;

import java.util.List;

public interface BaseController<T> {
    //List<T> getAll();
    T getById(Long id);
    void add(T entity);
    T update(Long id, T entity);
    void delete(Long id);

}
