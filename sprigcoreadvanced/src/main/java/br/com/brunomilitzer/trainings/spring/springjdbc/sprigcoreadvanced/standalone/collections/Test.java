package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "collectionsconfig.xml" );
        ProductsList productsList = ( ProductsList ) ctx.getBean( "productsList" );

        System.out.println(productsList);
    }
}
