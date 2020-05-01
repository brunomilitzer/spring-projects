package br.com.brunomilitzer.trainings.spring.springjdbc.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = ( JdbcTemplate ) ctx.getBean( "jdbcTemplate" );

        String sql = "INSERT INTO employee values (?, ?, ?)";
        int result = jdbcTemplate.update( sql, 1, "Vanessa", "de Garcez" );

        System.out.println("Number of records inserted are: " + result);
    }
}
