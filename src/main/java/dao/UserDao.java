package dao;

import entities.User;

import javax.persistence.Query;
import java.util.*;

public class UserDao extends AbstractDao<User, String> {


    @Override
    public User create(User entity) {
        super.openSession();
        super.getCurrentSession().save(entity);
        super.closeSession();
        return entity;
    }

    @Override
    public User findById(int id) {
        super.openSession();
        User user = super.getCurrentSession().get(User.class, id);
        super.closeSession();
        return user;
    }

    @Override
    public List<User> findByKeyL(String key) {
        super.openSession();
        Query query = super.getCurrentSession().createQuery("SELECT u FROM User u WHERE u.login =: userName");
        query.setParameter("userName", key);
        List<User> users = query.getResultList();
        super.closeSession();
        return users;
    }


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteAll() {

    }
}
