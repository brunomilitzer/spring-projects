package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.list;

import java.io.Serializable;
import java.util.List;

public class Hospital implements Serializable {

    private static final long serialVersionUID = -3986701656211551770L;

    private String name;

    private List<String> departements;

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public List<String> getDepartements( ) {
        return departements;
    }

    public void setDepartements( List<String> departements ) {
        this.departements = departements;
    }
}
