package br.com.brunomilitzer.trainings.spring.springorm.dao;

import br.com.brunomilitzer.trainings.spring.springorm.entity.Product;

import java.util.List;

public interface ProductDAO {

    int create( Product product);

    void update(Product product);

    void delete(Product product);

    Product findById( int id);

    List<Product> findAll();
}
