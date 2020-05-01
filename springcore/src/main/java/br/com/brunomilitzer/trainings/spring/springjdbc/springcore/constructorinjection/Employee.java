package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.constructorinjection;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -3534730013175965617L;

    private int id;

    private Address address;

    public Employee( int id, Address address ) {

        this.id = id;
        this.address = address;
    }

    @Override
    public String toString( ) {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }
}
