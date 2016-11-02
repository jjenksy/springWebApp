package com.logicode.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 11/2/2016.
 * This pogo is used with JPA annotations to show the struture and interact with the database
 */

@Entity
@Table(name = "EPG_Service_Ticket") //specify the name of the table
@XmlRootElement(name = "EPG_Service_Ticket")
public class EPGServiceTicket {



    //@Id sets the primary key and @GeneratedValue(strategy = GenerationType.AUTO) makes it auto generate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Long getId() {
        return id;
    }

//    @ManyToOne //establish a relationship allowing ManyService tickets for one Customer
//    private Customer customer;//a reference to the customer object so we can establish a relationship


//    /**
//     * Getter for the customer allows us to return established customers by there ID
//     * @return the customer this ticket is related to
//     */
//
//    public Customer getCustomer(){
//        return customer;
//    }

}
