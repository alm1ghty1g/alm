package dao;

import entities.Product;

import javax.persistence.Query;
import java.util.*;

public class ProductDao extends AbstractDao<Product, String> {


    @Override
    public Product create(Product entity) {
        super.openSession();
        super.getCurrentSession().save(entity);
        super.closeSession();

        return entity;
    }

    @Override
    public Product findById(int id) {
        super.openSession();
        Product product = super.getCurrentSession().get(Product.class, id);
        super.closeSession();
        return product;
    }

    @Override
    public List<Product> findByKeyL(String key) {
        super.openSession();
        Query query = super.getCurrentSession().createQuery("SELECT p FROM Product p WHERE p.name =: productName");
        query.setParameter("productName", key);
        List<Product> products = query.getResultList();
        super.closeSession();
        return products;
    }


    @Override
    public List<Product> findAll() {
        super.openSession();
        Query query = super.getCurrentSession().createQuery("SELECT p FROM Product p");

        List<Product> products = query.getResultList();
        super.closeSession();
        return products;
    }

    @Override
    public void update(Product entity) {
        super.openSession();
        super.getCurrentSession().update(entity);
        super.closeSession();
    }

    @Override
    public void delete(Product product) {
        super.openSession();
        super.getCurrentSession().delete(product);
        super.closeSession();
    }

    @Override
    public void deleteAll() {
        super.openSession();
        Query query = super.getCurrentSession().createQuery("DELETE FROM Product");
        query.executeUpdate();
        super.closeSession();
    }
}
