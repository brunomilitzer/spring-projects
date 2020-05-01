package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.set;

import java.io.Serializable;
import java.util.Set;

public class CarDealer implements Serializable {

    private static final long serialVersionUID = -7210617881599835306L;

    private String name;

    private Set<String> models;

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Set<String> getModels( ) {
        return models;
    }

    public void setModels( Set<String> models ) {
        this.models = models;
    }
}
