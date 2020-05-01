package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.map;

import java.io.Serializable;
import java.util.Map;

public class Customer implements Serializable {

    private static final long serialVersionUID = 8621364752360147117L;

    private int id;

    private Map<Integer, String> products;

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public Map<Integer, String> getProducts( ) {
        return products;
    }

    public void setProducts( Map<Integer, String> products ) {
        this.products = products;
    }

    @Override
    public String toString( ) {
        return "Customer[ id = " + id + ", products = " + products + "]";
    }
}
