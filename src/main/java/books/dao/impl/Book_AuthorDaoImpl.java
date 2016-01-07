package books.dao.impl;

import books.dao.BookAuthorDao;
import books.table.BookAuthor;
import books.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 05.01.2016.
 */
public class Book_AuthorDaoImpl extends DaoImpl<BookAuthor> implements BookAuthorDao{


    public Book_AuthorDaoImpl() {
        super(BookAuthor.class);
    }
}
