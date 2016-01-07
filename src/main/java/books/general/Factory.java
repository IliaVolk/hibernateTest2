package books.general;

import books.dao.AuthorDao;
import books.dao.BookDao;
import books.dao.Book_AuthorDao;
import books.dao.Dao;
import books.dao.impl.AuthorDaoImpl;
import books.dao.impl.BookDaoImpl;
import books.dao.impl.Book_AuthorDaoImpl;
import books.table.Author;
import books.table.Book;

/**
 * Created by user on 05.01.2016.
 */
public class Factory {
    private static Factory instance;
    private BookDao bookDao;
    private AuthorDao authorDao;
    private Book_AuthorDao book_authorDao;
    private Factory(){}
    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return Factory.instance;
    }

    public BookDao getBookDao(){
        if (bookDao == null) bookDao = new BookDaoImpl();
        return bookDao;
    }

    public AuthorDao getAuthorDao() {
        if (authorDao == null) authorDao = new AuthorDaoImpl();
        return authorDao;
    }

    public Book_AuthorDao getBook_authorDao() {
        if (book_authorDao == null) book_authorDao = new Book_AuthorDaoImpl();
        return book_authorDao;
    }
}
