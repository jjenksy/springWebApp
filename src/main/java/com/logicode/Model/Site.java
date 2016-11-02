package com.logicode.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 11/2/2016.
 */

@Entity//Entitys are objects that live shorly in memory but persistant in the database
@Table(name = "site") //specify the name of the table
@XmlRootElement(name = "site")
public class Site {
    //the key that is Auto generated
    @Id // declares the variable id as the key to the table
    @Column(name = "SITE_ID")//give the column a bette name
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private Long id;
    private String site;


//    @ManyToOne
//    @JoinColumn(name ="CUSTOMER_ID" )
//    private Customer customer;




    public Long getId() {
        return id;
    }

    public String getSite() {

        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
