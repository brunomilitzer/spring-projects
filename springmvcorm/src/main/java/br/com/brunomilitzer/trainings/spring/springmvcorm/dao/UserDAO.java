package br.com.brunomilitzer.trainings.spring.springmvcorm.dao;

import br.com.brunomilitzer.trainings.spring.springmvcorm.model.User;

import java.util.List;

public interface UserDAO {

    int create( User user);

    List<User> findUsers();

    User findUser(Integer id);
}
