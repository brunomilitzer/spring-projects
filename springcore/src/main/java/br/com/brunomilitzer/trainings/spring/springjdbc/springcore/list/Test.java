package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "listconfig.xml" );

        Hospital hospital = ( Hospital ) ctx.getBean( "hospital" );

        System.out.println("Hospital Name: " + hospital.getName());
        System.out.println("Departements: " + hospital.getDepartements());
        System.out.println("List Type: " + hospital.getDepartements().getClass());

    }
}
