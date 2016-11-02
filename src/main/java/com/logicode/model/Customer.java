package com.logicode.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 11/1/2016.
 *  THis class is a the java object with properties describing a customer and the
 * necesarry setters and getters.It’s annotated with @Entity
 *designating it as a JPA entity. The id property is annotated with @Id and @Generated-
 *Value to indicate that this field is the entity’s identity and that its value will be automatically
 *provided.
 *@Table the name of the table in the database
 */


@Entity
@Table(name = "customer")
@XmlRootElement(name = "customer")
public class Customer {
    //the key that is Auto generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String city;
    private String country;
    private String customerName;
    private int zip;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
