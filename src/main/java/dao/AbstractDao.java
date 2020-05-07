package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public abstract class AbstractDao<T, K> implements Dao<T, K> {

    private Session session;
    private Transaction transaction;


    public Session openSession() {
        session = buildSessionFactory().openSession();
        transaction = session.beginTransaction();

        return session;
    }

    public void closeSession() {
        transaction.commit();
        session.close();
    }

    public Session getCurrentSession() {
        return session;
    }


    private static SessionFactory buildSessionFactory() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            return new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return null;
    }

}
