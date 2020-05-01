package br.com.brunomilitzer.trainings.spring.springjdbc.employee.dao.impl;

import br.com.brunomilitzer.trainings.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import br.com.brunomilitzer.trainings.spring.springjdbc.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int create( Employee employee ) {
        String sql = "INSERT INTO employee values (?, ?, ?)";

        return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
    }

    @Override
    public int update( Employee employee ) {
        String sql = "UPDATE employee SET firstname = ?, lastname = ? where id = ?";

        return jdbcTemplate.update( sql, employee.getFirstName(), employee.getLastName(), employee.getId() );
    }

    @Override
    public int delete( int id ) {
        String sql = "DELETE FROM employee WHERE id = ?";

        return jdbcTemplate.update( sql, id );
    }

    @Override
    public Employee read( int id ) {
        String sql = "SELECT * FROM employee WHERE id = ?";

        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        return jdbcTemplate.queryForObject( sql, rowMapper, id );
    }

    @Override
    public List<Employee> readEmployees( ) {
        String sql = "SELECT * FROM employee";

        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        return jdbcTemplate.query( sql, rowMapper);
    }

    public JdbcTemplate getJdbcTemplate( ) {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate( JdbcTemplate jdbcTemplate ) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
