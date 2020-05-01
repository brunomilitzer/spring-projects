package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.innerbeans;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -3534730013175965617L;

    private int id;

    private Address address;

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public Address getAddress( ) {
        return address;
    }

    public void setAddress( Address address ) {
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
