package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.annoations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -3534730013175965617L;

    @Autowired(required = false)
    @Qualifier("address123")
    private Address address;

    /*@Autowired*/
/*    public Employee( Address address ) {
        this.address = address;
    }*/

    /*public Address getAddress( ) {
        return address;
    }*/

/*    @Autowired
    public void setAddress( Address address ) {
        this.address = address;
    }*/

    @Override
    public String toString( ) {
        return "Employee{ address = " + address + '}';
    }
}
