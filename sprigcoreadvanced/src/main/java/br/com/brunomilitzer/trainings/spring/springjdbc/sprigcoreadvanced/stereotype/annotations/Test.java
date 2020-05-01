package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "stereotypeannotationsconfig.xml" );

        Instructor instructor = ( Instructor ) ctx.getBean( "instructor" );

        Instructor instructor2 = ( Instructor ) ctx.getBean( "instructor" );

        Instructor instructor3 = ( Instructor ) ctx.getBean( "instructor" );

        System.out.println(instructor.hashCode());
        System.out.println(instructor2.hashCode());
        System.out.println(instructor3);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
