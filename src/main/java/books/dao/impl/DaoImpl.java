package books.dao.impl;

import books.dao.Dao;
import books.table.Book;
import books.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 05.01.2016.
 */
public abstract class DaoImpl<E> implements Dao<E> {
    private Class thisClass;
    public DaoImpl(Class cls){
        thisClass = cls;
    }
    @Override
    public void add(E object) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(object);
            session.getTransaction().commit();
        }catch (Exception e){e.printStackTrace();}
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public void delete(E object) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(object);
            session.getTransaction().commit();
        }catch (Exception e){e.printStackTrace();}
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public E get(int id) throws SQLException{
        E result = null;

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            result = (E)session.load(thisClass, id);
            session.getTransaction().commit();
        }catch (Exception e) {e.printStackTrace();}
        finally {
            if (session != null && session.isOpen())
                session.close();
        }

        return result;
    }

    @Override
    public List<E> get() throws SQLException{
        List<E> objects = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            objects = (List<E>)session.createCriteria(thisClass).list();
            session.getTransaction().commit();
        }catch (Exception e) {e.printStackTrace();}
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return objects;
    }

}
