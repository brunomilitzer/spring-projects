package br.com.brunomilitzer.trainings.spring.springorm.dao;

import br.com.brunomilitzer.trainings.spring.springorm.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("productDAO")
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create( Product product ) {
        return  ( Integer ) hibernateTemplate.save( product );
    }

    @Override
    @Transactional
    public void update( Product product ) {
        hibernateTemplate.update( product );
    }

    @Override
    @Transactional
    public void delete( Product product ) {
        hibernateTemplate.delete( product );
    }

    @Override
    public Product findById( int id ) {
        return hibernateTemplate.get( Product.class, id );
    }

    @Override
    public List<Product> findAll( ) {
        return hibernateTemplate.loadAll( Product.class );
    }
}
