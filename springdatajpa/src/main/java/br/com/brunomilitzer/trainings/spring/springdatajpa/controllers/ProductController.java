package br.com.brunomilitzer.trainings.spring.springdatajpa.controllers;

import br.com.brunomilitzer.trainings.spring.springdatajpa.model.Product;
import br.com.brunomilitzer.trainings.spring.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    @GetMapping
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return repository.findById( id ).orElse( null );
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repository.save( product );
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return repository.save( product );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById( id );
    }

    @Autowired
    public void setRepository( ProductRepository repository ) {
        this.repository = repository;
    }
}
