package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext( "reftypeconfig.xml" );

        Student student = ( Student ) ctx.getBean( "student" );

        System.out.println(student);
    }
}
