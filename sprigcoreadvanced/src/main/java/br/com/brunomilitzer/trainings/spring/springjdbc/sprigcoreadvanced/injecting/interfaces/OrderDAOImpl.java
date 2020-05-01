package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDAO")
public class OrderDAOImpl implements OrderDAO {

    public void createOrder( ) {
        System.out.println("Inside Order DAO createOrder()");
    }
}
