package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("injectioninterfacesconfig.xml");

        OrderBO orderBO = ( OrderBO ) ctx.getBean( "orderBO" );
        orderBO.placeOrder();
    }
}
