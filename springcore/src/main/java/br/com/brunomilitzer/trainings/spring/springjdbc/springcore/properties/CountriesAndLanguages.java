package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.properties;

import java.io.Serializable;
import java.util.Properties;

public class CountriesAndLanguages implements Serializable {

    private static final long serialVersionUID = 1819369960791470300L;

    private Properties countriesAndLanguages;

    public Properties getCountriesAndLanguages( ) {
        return countriesAndLanguages;
    }

    public void setCountriesAndLanguages( Properties countriesAndLanguages ) {
        this.countriesAndLanguages = countriesAndLanguages;
    }

    @Override
    public String toString( ) {
        return "CountriesAndLanguages{ countriesAndLanguages=" + countriesAndLanguages + '}';
    }
}
