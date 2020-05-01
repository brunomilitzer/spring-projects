package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBO")
public class OrderBOImpl implements OrderBO {

    @Autowired
    @Qualifier("orderDAO2")
    private OrderDAO orderDAO;

    public void placeOrder( ) {
        System.out.println("Inside Order BO placeOrder()");
        orderDAO.createOrder();
    }

    public OrderDAO getOrderDAO( ) {
        return orderDAO;
    }

    public void setOrderDAO( OrderDAO orderDAO ) {
        this.orderDAO = orderDAO;
    }
}
