package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.autowiring;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -3534730013175965617L;

    private Address address;

    public Employee( Address address ) {
        this.address = address;
    }

    public Address getAddress( ) {
        return address;
    }

    public void setAddress( Address address ) {
        this.address = address;
    }

    @Override
    public String toString( ) {
        return "Employee{ address = " + address + '}';
    }
}
