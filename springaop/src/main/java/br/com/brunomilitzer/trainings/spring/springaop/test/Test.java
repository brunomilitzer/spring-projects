package br.com.brunomilitzer.trainings.spring.springaop.test;

import br.com.brunomilitzer.trainings.spring.springaop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ProductService productService = ( ProductService ) ctx.getBean( "productService" );
        int result = productService.multiply( 5, 2 );

        System.out.println("Result of multiply: " + result);
    }
}
