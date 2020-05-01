package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "constructorambiguityconfig.xml" );

        Addition addition = ( Addition ) ctx.getBean( "addition" );

        System.out.println(addition);
    }
}
