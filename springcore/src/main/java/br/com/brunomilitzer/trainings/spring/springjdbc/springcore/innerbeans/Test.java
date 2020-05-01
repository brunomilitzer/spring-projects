package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "innerbeansconfig.xml" );

        Employee employee = ( Employee ) ctx.getBean( "employee" );
        Employee employee2 = ( Employee ) ctx.getBean( "employee" );

        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());
    }
}
