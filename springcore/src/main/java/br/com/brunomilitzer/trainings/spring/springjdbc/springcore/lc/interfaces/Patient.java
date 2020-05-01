package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;

public class Patient implements InitializingBean, DisposableBean, Serializable {

    private static final long serialVersionUID = -857697399838961947L;

    private int id;

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        System.out.println("Inside the setter method");
        this.id = id;
    }

    @Override
    public void afterPropertiesSet( ) throws Exception {
        System.out.println("Inside afterPropertiesSet Method");
    }

    public void hi() {
        System.out.println("Inside Hi Method");
    }

    public void goodbye() {
        System.out.println("Inside Goodbye Method");
    }

    @Override
    public void destroy( ) throws Exception {
        System.out.println("Inside destroy Method");
    }

    @Override
    public String toString( ) {
        return "Patient{ id = " + id + '}';
    }

}
