package actors;

import actors.Actor;
import actors.Cast;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by user on 04.01.2016.
 */
public class HibernateUtil {
    static {
        /*AnnotationConfiguration aconf = new AnnotationConfiguration()
                .addAnnotatedClass(Video.class)
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Cast.class);
        Configuration conf = aconf.configure();
        factory = conf.buildSessionFactory();*/
    }
    static SessionFactory factory;
    public static void main(String args[]){
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            /*actors.Video video = new actors.Video();
            //video.setId();
            video.setDescription("Калигула");

            actors.Actor actor = new actors.Actor();
            //actor.setId(new Long(1));

            actor.setName("Телка из массовки звать Маня");
            actors.Cast cast = new actors.Cast();
            cast.setVideo(video);
            cast.setActor(actor);
            session.saveOrUpdate(video);
            session.saveOrUpdate(actor);
            session.saveOrUpdate(cast);*/
            /*SQLQuery query = session.createSQLQuery(
                    "SELECT actor.id, actor.birthday, actor.name from test.actor where actor.id in " +
                            "(select cast.actor from test.cast where cast.video = '1')");
            query.addEntity(actors.Actor.class);
            List actors = query.list();*/
            //List actors = session.createCriteria(actors.Actor.class).list();
            List casts = session.createCriteria(Cast.class).list();
            session.getTransaction().commit();
            for (Object o : casts){
                if (o instanceof Cast){
                    //actors.Actor a = (actors.Actor) o;
                    Actor a = ((Cast) o).getActor();
                    System.out.println(String.format("%s %s %s", a.getId(), a.getName(), a.getBirthday()));
                }
            }

        }finally {
            session.close();
        }



    }
}
