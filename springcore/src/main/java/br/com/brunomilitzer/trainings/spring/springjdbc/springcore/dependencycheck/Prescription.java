package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import java.util.List;

public class Prescription implements Serializable {

    private static final long serialVersionUID = -8692538587563500784L;

    private int id;

    private String patientName;

    private List<String> medicines;

    public int getId( ) {
        return id;
    }

    @Required
    public void setId( int id ) {
        this.id = id;
    }

    public String getPatientName( ) {
        return patientName;
    }

    public void setPatientName( String patientName ) {
        this.patientName = patientName;
    }

    public List<String> getMedicines( ) {
        return medicines;
    }

    public void setMedicines( List<String> medicines ) {
        this.medicines = medicines;
    }

    @Override
    public String toString( ) {
        return "Prescription{id = " + id + ", patientName='" + patientName + ", medicines=" + medicines + '}';
    }
}
