package books.dao.impl;

import books.dao.BookDao;
import books.dao.Dao;
import books.util.HibernateUtil;
import books.table.Book;

import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 05.01.2016.
 */
public class BookDaoImpl extends DaoImpl<Book> implements BookDao{
    public BookDaoImpl() {
        super(Book.class);
    }
}
