package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "setconfig.xml" );

        CarDealer cardealer = ( CarDealer ) ctx.getBean( "cardealer" );

        System.out.println("Car Dealer Name: " + cardealer.getName());
        System.out.println("Models: " + cardealer.getModels());
        System.out.println("Type: " + cardealer.getModels().getClass());
    }
}
