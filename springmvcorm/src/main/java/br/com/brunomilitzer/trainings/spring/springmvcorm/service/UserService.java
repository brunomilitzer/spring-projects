package br.com.brunomilitzer.trainings.spring.springmvcorm.service;

import br.com.brunomilitzer.trainings.spring.springmvcorm.model.User;

import java.util.List;

public interface UserService {

    int save( User user );

    List<User> getUsers();

    User getUser(Integer id);
}
