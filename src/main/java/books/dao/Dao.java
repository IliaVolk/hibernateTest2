package books.dao;

import books.table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 05.01.2016.
 */
public interface Dao<E> {
    public void add(E book) throws SQLException;
    public void delete(E book) throws SQLException;
    public E get(int id) throws SQLException;
    public List<E> get() throws SQLException;
}
