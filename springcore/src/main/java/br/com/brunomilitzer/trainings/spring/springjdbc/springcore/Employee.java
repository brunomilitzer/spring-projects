package br.com.brunomilitzer.trainings.spring.springjdbc.springcore;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1322542395229049928L;

    private int id;

    private String name;

    private int age;

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge( ) {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }
}
