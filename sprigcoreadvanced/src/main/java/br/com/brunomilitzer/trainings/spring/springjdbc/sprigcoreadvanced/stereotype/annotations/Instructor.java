package br.com.brunomilitzer.trainings.spring.springjdbc.sprigcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("instructor")
@Scope("prototype")
public class Instructor {

    /*@Value( "55" )*/
//    @Value( "#{T(java.lang.Math).abs(-99)}" )
    /*@Value( "#{new Integer(88)}" )*/
    @Value( "#{T(java.lang.Integer).MIN_VALUE}" )
    private int id = 20;

    //@Value( "Vanessa de Garcez" )
    /*@Value( "#{'Tales de Garcez Coelho'.toUpperCase()}" )*/
    @Value( "#{new java.lang.String('Bruno Militzer').toLowerCase()}" )
    private String name = "Tales de Garcez Coelho";

    //@Value( "#{2+4 > 5}" )
    //@Value( "#{2+4 > 8? false : true}" )
    @Value( "#{2+4 > 8? true : false}" )
    private boolean active;

    @Value( "#{courses}" )
    private List<String> courses;

    private Profile profile;

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

    public List<String> getCourses( ) {
        return courses;
    }

    public void setCourses( List<String> courses ) {
        this.courses = courses;
    }

    public Profile getProfile( ) {
        return profile;
    }

    @Autowired
    public void setProfile( Profile profile ) {
        this.profile = profile;
    }

    @Override
    public String toString( ) {
        return "Instructor{ id = " + id +", name='" + name + ", courses: " + courses + ", profile: " + profile + ", active: " + active + '}';
    }
}
