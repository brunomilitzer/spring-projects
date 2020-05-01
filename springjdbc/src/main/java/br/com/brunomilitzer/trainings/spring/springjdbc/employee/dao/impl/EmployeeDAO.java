package br.com.brunomilitzer.trainings.spring.springjdbc.employee.dao.impl;

import br.com.brunomilitzer.trainings.spring.springjdbc.employee.dto.Employee;

import java.util.List;

public interface EmployeeDAO {

    int create( Employee employee );

    int update(Employee employee);

    int delete(int id);

    Employee read(int id);

    List<Employee> readEmployees();
}
