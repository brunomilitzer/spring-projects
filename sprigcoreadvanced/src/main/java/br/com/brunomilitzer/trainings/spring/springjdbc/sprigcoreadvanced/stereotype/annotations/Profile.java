package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Value( "Java Developer" )
    private String title;

    @Value( "NEO Insights Ltd." )
    private String company;

    public String getTitle( ) {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getCompany( ) {
        return company;
    }

    public void setCompany( String company ) {
        this.company = company;
    }

    @Override
    public String toString( ) {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
