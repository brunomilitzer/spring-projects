package br.com.brunomilitzer.trainings.spring.springmvcorm.dao;

import br.com.brunomilitzer.trainings.spring.springmvcorm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate( ) {
        return hibernateTemplate;
    }

    @Autowired
    public void setHibernateTemplate( HibernateTemplate hibernateTemplate ) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int create( User user ) {
        return ( Integer ) hibernateTemplate.save( user );
    }

    @Override
    public List<User> findUsers( ) {
        return hibernateTemplate.loadAll( User.class );
    }

    @Override
    public User findUser( Integer id ) {
        return hibernateTemplate.get( User.class, id );
    }
}
