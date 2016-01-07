package books.util;

import actors.Actor;
import actors.Cast;
import actors.Video;
import books.table.Book;
import books.table.Book_Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Created by user on 05.01.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private HibernateUtil(){}
    static {
        /*
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }*/

        AnnotationConfiguration aconf = new AnnotationConfiguration()
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Book_Author.class);
        Configuration conf = aconf.configure();
        sessionFactory = conf.buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
