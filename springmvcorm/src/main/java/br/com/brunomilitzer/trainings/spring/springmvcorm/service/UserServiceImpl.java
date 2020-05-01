package br.com.brunomilitzer.trainings.spring.springmvcorm.service;

import br.com.brunomilitzer.trainings.spring.springmvcorm.dao.UserDAO;
import br.com.brunomilitzer.trainings.spring.springmvcorm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO dao;

    public UserDAO getDao( ) {
        return dao;
    }

    @Autowired
    public void setDao( UserDAO dao ) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public int save( User user ) {
        // Business Logic
        return dao.create( user );
    }

    @Override
    public List<User> getUsers( ) {
        List<User> users = dao.findUsers();
        Collections.sort(users);

        return users;
    }

    @Override
    public User getUser( Integer id ) {
        return dao.findUser( id );
    }
}
