package br.com.brunomilitzer.trainings.spring.springjdbc.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext( "config.xml" );
        Employee employee = ( Employee ) ctx.getBean( "employee" );

        System.out.println("Employee ID: "+ employee.getId());
        System.out.println("Employee Name: "+ employee.getName());
        System.out.println("Employee Age: "+ employee.getAge());

    }
}
