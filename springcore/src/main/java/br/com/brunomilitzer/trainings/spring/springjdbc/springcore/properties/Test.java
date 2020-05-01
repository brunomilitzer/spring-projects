package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "propertiesconfig.xml" );

        CountriesAndLanguages countriesAndLangs = ( CountriesAndLanguages ) ctx.getBean( "countriesAndLangs" );

        System.out.println(countriesAndLangs);
    }
}
