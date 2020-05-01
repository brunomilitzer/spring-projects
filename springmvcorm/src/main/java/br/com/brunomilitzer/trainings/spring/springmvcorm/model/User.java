package br.com.brunomilitzer.trainings.spring.springmvcorm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Comparable<User>, Serializable {

    private static final long serialVersionUID = -1729339974327835940L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    public Integer getId( ) {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getEmail( ) {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    @Override
    public String toString( ) {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo( User user ) {
        return this.id.compareTo( user.id );
    }
}
