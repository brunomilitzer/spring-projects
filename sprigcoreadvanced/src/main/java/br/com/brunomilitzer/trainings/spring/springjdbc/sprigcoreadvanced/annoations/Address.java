package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.annoations;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -5140096640302475945L;

    private int number;

    private String street;

    private String city;

    public int getNumber( ) {
        return number;
    }

    public void setNumber( int number ) {
        this.number = number;
    }

    public String getStreet( ) {
        return street;
    }

    public void setStreet( String street ) {
        this.street = street;
    }

    public String getCity( ) {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    @Override
    public String toString( ) {
        return "Address{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
