package br.com.brunomilitzer.trainings.spring.springjdbc.employee.test;

import br.com.brunomilitzer.trainings.spring.springjdbc.employee.dao.impl.EmployeeDAO;
import br.com.brunomilitzer.trainings.spring.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main( String[] args ) {
        EmployeeDAO employeeDAO = getEmployeeDAO( getApplicationContext() );

        //insertEmployee( employeeDAO );

        //updateEmployee( employeeDAO );

        //deleteEmployee( employeeDAO );

        //readEmployee( employeeDAO );

        readEmployees( employeeDAO );
    }

    private static void insertEmployee( EmployeeDAO employeeDAO ) {
        Employee employee = new Employee();
        employee.setId( 2 );
        employee.setFirstName( "Tales" );
        employee.setLastName( "de Garcez Coelho" );

        int result = employeeDAO.create( employee );

        System.out.println("Number of records inserted are: " + result);
    }

    private static void updateEmployee(EmployeeDAO employeeDAO) {

        Employee employee = new Employee();
        employee.setId( 2 );
        employee.setFirstName( "Tales" );
        employee.setLastName( "de Garcez" );

        int result = employeeDAO.update( employee );

        System.out.println("Number of records updated are: " + result);
    }

    private static void deleteEmployee(EmployeeDAO employeeDAO) {

        Employee employee = new Employee();
        employee.setId( 2 );
        employee.setFirstName( "Tales" );
        employee.setLastName( "de Garcez" );

        int result = employeeDAO.delete( employee.getId() );

        System.out.println("Number of records delete are: " + result);
    }

    private static void readEmployee(EmployeeDAO employeeDAO) {
        Employee employee = employeeDAO.read( 2 );

        System.out.println(employee);
    }

    private static void readEmployees(EmployeeDAO employeeDAO) {
        List<Employee> employees = employeeDAO.readEmployees();

        System.out.println(employees);
    }

    private static EmployeeDAO getEmployeeDAO( ApplicationContext ctx ) {
        return ( EmployeeDAO ) ctx.getBean( "employeeDAO" );
    }

    private static ApplicationContext getApplicationContext( ) {
        return new ClassPathXmlApplicationContext("daoconfig.xml");
    }
}
