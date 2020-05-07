package services;


import dao.Dao;
import dao.DaoException;
import dao.ProductDao;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private Dao<Product, String> dao = new ProductDao();

    public String addProduct(String image, String name, double price, int quantity) {

        if (image == null || name == null || price == 0 || quantity == 0) {
            return "incorrect input";
        }
        Product product = new Product(0, name, price);

        product = dao.create(product);

        if (product.getId() != 0) {
            return "product created";
        } else return "problem with creating";
    }

    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    public Product readProductById(int id) {
        return dao.findById(id);
    }

    public void deleteProduct(int id) {
        Product product = dao.findById(id);
        dao.delete(product);
    }

    public boolean updateProduct(int id, String name, double price, String image, int quantity) {
        Product product = new Product(id, name, price);

        dao.update(product);
        return true;
    }
}
