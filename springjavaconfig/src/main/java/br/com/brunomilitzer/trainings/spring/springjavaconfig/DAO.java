package br.com.brunomilitzer.trainings.spring.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class DAO {

    public void create() {
        System.out.println("Created");
    }
}
