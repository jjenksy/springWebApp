package com.logicode.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jjenkins on 11/2/2016.
 */

@Entity//Entitys are objects that live shorly in memory but persistant in the database
@Table(name = "workorder") //specify the name of the table
@XmlRootElement(name = "workorder")
public class WorkOrder {
    //the key that is Auto generated
    @Id // declares the variable id as the key to the table
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private Long id;

    //work to be performed
    private String workRequested;


}
