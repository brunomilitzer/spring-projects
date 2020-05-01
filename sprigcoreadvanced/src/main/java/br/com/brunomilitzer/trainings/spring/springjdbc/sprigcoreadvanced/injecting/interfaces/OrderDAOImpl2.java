package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDAO2")
public class OrderDAOImpl2 implements OrderDAO {

    public void createOrder( ) {
        System.out.println("Inside Order DAO 2 createOrder()");
    }
}
