package br.com.brunomilitzer.trainings.springboot.service;

import br.com.brunomilitzer.trainings.springboot.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private DAO dao;

    @Autowired
    public Service(DAO dao ) {
        System.out.println("Service Bean Created");
        this.dao = dao;
    }

    public void save() {
        dao.create();
    }
}
