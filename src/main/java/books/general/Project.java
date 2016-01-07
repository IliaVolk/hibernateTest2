package books.general;

import actors.Actor;
import actors.Cast;
import actors.Video;
import books.dao.BookDao;
import books.table.Author;
import books.table.Book;
import books.table.Book_Author;
import books.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 05.01.2016.
 */
public class Project {
    public static void main(String[] args) throws SQLException{
        Factory factory = Factory.getInstance();

        List<Book> listB = factory.getBookDao().get();
        List<Author> listA = factory.getAuthorDao().get();
        listB.forEach(e -> System.out.println(e.getId()+e.getTitle()+e.getDescription()));
        listA.forEach(e -> System.out.println(e.getId()+e.getFirstName()+e.getMiddleName()));


    }
}
