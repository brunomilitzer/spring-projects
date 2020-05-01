package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

public class Patient implements Serializable {

    private static final long serialVersionUID = -857697399838961947L;

    private int id;

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        System.out.println("Inside the setter method");
        this.id = id;
    }

    @PostConstruct
    public void hi() {
        System.out.println("Inside Hi Method");
    }

    @PreDestroy
    public void goodbye() {
        System.out.println("Inside Goodbye Method");
    }

    @Override
    public String toString( ) {
        return "Patient{ id = " + id + '}';
    }

}
