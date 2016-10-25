package com.logicode.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 10/21/2016.
 * THis class is a sample java object with properties describing a user and the
 * necesarry setters and getters.It’s annotated with @Entity
 *designating it as a JPA entity. The id property is annotated with @Id and @Generated-
 *Value to indicate that this field is the entity’s identity and that its value will be automatically
 *provided.
 *@Table the name of the table in the database
 */

@Entity
@Table(name = "users")
@XmlRootElement(name = "users")
public class User {

    //the key that is Auto generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String email;
    private String fistName;
    private String lastName;
    private String bio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
