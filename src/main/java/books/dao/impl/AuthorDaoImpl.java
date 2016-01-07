package books.dao.impl;


import books.dao.AuthorDao;
import books.table.Author;
import books.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;


/**
 * Created by user on 05.01.2016.
 */
public class AuthorDaoImpl  extends DaoImpl<Author>  implements AuthorDao{


    public AuthorDaoImpl() {
        super(Author.class);
    }
}
