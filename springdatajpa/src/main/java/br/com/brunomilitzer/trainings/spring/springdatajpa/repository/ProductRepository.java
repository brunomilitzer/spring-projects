package br.com.brunomilitzer.trainings.spring.springdatajpa.repository;

import br.com.brunomilitzer.trainings.spring.springdatajpa.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);

    List<Product> findByPrice(Double price);

    List<Product> findByNameAndPrice(String name, Double price);
}
